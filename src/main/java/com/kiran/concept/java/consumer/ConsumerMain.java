package com.kiran.concept.java.consumer;

import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) {
		Customer kiran = new Customer("Kiran", "999999999"); 
		
		greetCustomer(kiran);
		
		// Consumer funcation interface 
		greetCustomerConsumer.accept(kiran);
		

	}
	
	static Consumer<Customer> greetCustomerConsumer = customer->
			System.out.println("Hello "+ customer.name+
					", thanks for registering phone number"
					+ customer.phoneNumber);
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hello "+customer.name +
				", thanks for registering phone number"
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
