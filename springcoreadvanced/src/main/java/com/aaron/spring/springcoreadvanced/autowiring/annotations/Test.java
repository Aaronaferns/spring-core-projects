package com.aaron.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/aaron/spring/springcoreadvanced/autowiring/annotations/config.xml");
		
		Employee employee= (Employee) context.getBean("employee");
		System.out.println(employee);
		
	}
}