package com.kiran.concept.java;

public class Person {
	
	String name ; 
	
	Gender gender ; 
	
	int age ;
	
	public Person(String name, Gender gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	} 
	

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	
	
}