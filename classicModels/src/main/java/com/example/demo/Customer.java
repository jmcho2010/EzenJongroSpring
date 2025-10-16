package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "customers") // db의 테이블명과 대소문자까지 다 틀리다면 이렇게 table어노테이션을 통해
							// 맞출수 있음(매핑할수 있음)
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {

	// 엔티티 매핑시 주의사항
	// customer_number 라는 이름의 맴버변수 없는데요?
	// -> 
	@Id
	@Column(name ="customerNumber")
	private Integer customerNumber;
	
    @Column(name = "customerName", nullable = false, length = 50)
    private String customerName;

    @Column(name = "contactLastName", nullable = false, length = 50)
    private String contactLastName;

    @Column(name = "contactFirstName", nullable = false, length = 50)
    private String contactFirstName;

    @Column(name = "phone", nullable = false, length = 50)
    private String phone;
    
    @Column(name = "addressLine1", nullable = false, length = 50)
    private String addressLine1;
	
    @Column(name = "addressLine2", length = 50)
    private String addressLine2;
	
    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "postalCode", length = 15)
    private String postalCode;

    @Column(name = "country", nullable = false, length = 50)
    private String country;	
	
    @Column(name = "salesRepEmployeeNumber")
    private Integer salesRepEmployeeNumber;
	
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Order> orders;
    
    // predcision = 숫자 타입에서 전체 자릿수 지정
    //  -> 최대 10자리 숫자 지정
    // scale : 소수점 이하 자리수 지정
    //  -> 소수점 이하 2자리까지 저장 가능
    // BigDecimal : 자바에서 고정된 소수점 숫자를 표현하기 위한 참조타입.
    //  -> 주로 정확한 소수점 계산이나 금액을 계산하는 경우에 많이 사용.
    //  -> 크레딧한도 라던지 정확한 숫자 계산을 요구하는 금융 데이터를 처리하기 위해
    //     사용될 가능성이 매우 높음.
    @Column(name = "creditLimit", precision = 10, scale = 2)
    private BigDecimal creditLimit;	
	
	
//	@Override
//	public String toString() {
//		return this.addressLine1; 
//	}
	
	
	
	
	
	
}
