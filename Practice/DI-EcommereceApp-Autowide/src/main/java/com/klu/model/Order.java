package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	@Autowired
	private Product product;
	
	public Order() {
		this.orderId=2005;
		this.customerName="uday";
		this.quantity=4;
	}
	
	public void display() {
		System.out.println("the following the order details");
		System.out.println("OrderId:"+orderId);
		System.out.println("CustomerName:"+customerName);
		System.out.println("Quantity:"+quantity);
		System.out.println("ProductId:"+product.getProductId());
		System.out.println("ProductNmae:"+product.getProductName());
		System.out.println("ProductPrice:"+product.getprice());
		System.out.println("ProductCategory:"+product.getcategory());
		
	}

}
