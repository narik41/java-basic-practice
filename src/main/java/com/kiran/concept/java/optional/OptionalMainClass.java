package com.kiran.concept.java.optional;

import java.util.Optional;

public class OptionalMainClass {
	
	
	public static void main(String[] args) {
		
		Optional<String> empty = Optional.ofNullable(null);
		System.out.println(empty.isPresent());
		System.out.println(empty.isEmpty());
			 
		
		String upper = empty.map(String::toUpperCase)
							.orElse(" Welcome");
		System.out.println(upper);
	}
}
