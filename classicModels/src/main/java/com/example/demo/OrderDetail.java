package com.example.demo;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 반드시 매핑테이블은 직렬화가 필요한가?
//  -> JPA의 규칙.(복합키를 쓰기위해서는 JPA는 별도의 식별자 클래스를 요구)
@Data // getter + setter + toString + equals
@NoArgsConstructor
@AllArgsConstructor
class OrderDetailId implements Serializable {
    private Integer order;
    private String product;
}

@Entity
@Table(name="orderdetails")
@IdClass(OrderDetailId.class)
public class OrderDetail {

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orderNumber")
	private Order order;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productCode")
	private Product product;
	
    @Column(name = "quantityOrdered", nullable = false)
    private Integer quantityOrdered;

    @Column(name = "priceEach", nullable = false, precision = 10, scale = 2)
    private BigDecimal priceEach;

    @Column(name = "orderLineNumber", nullable = false)
    private Integer orderLineNumber;
}








