package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Customer;
import com.example.demo.Order;
import com.example.demo.Repo.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
    public Customer findById(Integer customerNumber) {
        return customerRepository.findById(customerNumber)
                .orElseThrow(() -> new RuntimeException("고객을 찾을 수 없습니다: " + customerNumber));
    }

	public List<Order> findOrdersByCustomerNumber(Integer customerId) {
		Customer customer = findById(customerId);
		return customer.getOrders();
	}

}
