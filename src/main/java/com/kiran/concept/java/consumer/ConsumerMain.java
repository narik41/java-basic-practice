package com.kiran.concept.java.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) {
		Customer kiran = new Customer("Kiran", "999999999"); 
		
		greetCustomer(kiran);
		
		// Consumer funcation interface 
		greetCustomerConsumer.accept(kiran);
		greetCustomerConsumerV2.accept(kiran, false);
		greetCustomerConsumerV2.accept(kiran, true);

	}
	
	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = 
			(customer, showPhoneNumber) -> 
	System.out.println("Hello "+ customer.name+
			", thanks for registering phone number "
			+ ( showPhoneNumber ? customer.phoneNumber : "***********"));
	
	static Consumer<Customer> greetCustomerConsumer = customer->
			System.out.println("Hello "+ customer.name+
					", thanks for registering phone number "
					+ customer.phoneNumber);
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hello "+customer.name +
				", thanks for registering phone number "
				+ customer.phoneNumber);
	}
	
	static class Customer{
		
		private String name ; 
		
		private  String phoneNumber ;

		public Customer(String name, String phoneNumber) {
			super();
			this.name = name;
			this.phoneNumber = phoneNumber;
		} 
	}

}
