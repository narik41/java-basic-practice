package com.kiran.concept.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream 
{
	private static List<Person> getPeople(){
		return List.of(
				new Person("Kiran Subedi", Gender.MALE, 28),
				new Person("Bishnu Hari Subedi", Gender.MALE, 58),
				new Person("Shreeram Sigdel", Gender.MALE, 33),
				new Person("Santosh Subedi", Gender.MALE, 30),
				new Person("Ram Thapa", Gender.MALE, 7),
				new Person("Gita Thapa", Gender.FEMALE, 10),
				new Person("Sita Shrestha", Gender.FEMALE, 28),
				new Person("Dipika Pa udel", Gender.FEMALE, 20)
		);
	}
	
    public static void main( String[] args )
    {
        List<Person> people = getPeople();
        
        // imperative approach 
        List<Person> females = new ArrayList<Person>();
        for(Person person : people) {
        	if(person.getGender().equals(Gender.FEMALE)) {
        		females.add(person);
        	}
        }
        
        // declrative approach 
         List<Person> females1 = people.stream()
        			.filter(person->person.getGender().equals(Gender.FEMALE))
        			.collect(Collectors.toList());
        
         females1.forEach(System.out::println);
         
         List<Person> sorted = people.stream()
         	.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender))
         	.collect(Collectors.toList());
         
         sorted.forEach(System.out::println);
        
    }
}
