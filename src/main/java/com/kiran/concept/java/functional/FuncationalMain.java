package com.kiran.concept.java.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FuncationalMain {

	public static void main(String[] args) {
		int increment = increment(0);
		System.out.println(increment);
		
		int increment2 = incrementFunction.apply(increment) ; 
		System.out.println(increment2);
		
		Function<Integer, Integer> addBy1AndThenMultiplyBy10 = 
				incrementFunction.andThen(multiplyBy10Function);
	
		System.out.println(addBy1AndThenMultiplyBy10.apply(4));
		
		// bifunction takes 2 argument and prodecure 1 result 
		int incMul = incrementByOneAndMultiply.apply(4, 100);
		System.out.println(incMul);
		
 	}
	
	static Function<Integer, Integer> multiplyBy10Function = 
			number -> number * 10 ; 
	
	static Function<Integer, Integer> incrementFunction = 
			number -> number+1 ;
			
	static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply = 
			(numberToIncrementByOne, numberToMultiplyBy) 
			-> (numberToIncrementByOne + 1) * numberToMultiplyBy ;
	
	static int increment(int number) {
		return number+1 ; 
	}
}
