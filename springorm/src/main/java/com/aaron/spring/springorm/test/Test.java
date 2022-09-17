package com.aaron.spring.springorm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aaron.spring.springorm.product.dao.impl.ProductDAOImpl;
import com.aaron.spring.springorm.product.entity.Product;



public class Test {
	public static void main(String[]args){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aaron/spring/springorm/test/config.xml");
		ProductDAOImpl dao=  (ProductDAOImpl) context.getBean("productDAO");
		
		Product p1= new Product();
		p1.setId(2);
		p1.setName("Yo-Yo");
		p1.setDesc("Its fun");
		p1.setPrice(45);
		
		int result= dao.create(p1);
		System.out.println(result);
	}
}
