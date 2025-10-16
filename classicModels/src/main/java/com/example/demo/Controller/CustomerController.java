package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Order;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;
 
    @GetMapping("/customer")
    public String list() {
    	return "customer-list";
    }
    
    @GetMapping("/customer/orders")
    public String getOrders(@RequestParam(value="customerId") Integer customerId, Model model) {
        
    	List<Order> orders = customerService.findOrdersByCustomerNumber(customerId);
        model.addAttribute("orders", orders);
        return "customer-orders"; // 주문 내역 전체 HTML 페이지 반환
    }
	
}
