package com.aaron.spring.springjdbc.employee;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.aaron.spring.springjdbc.employee.dao.impl.EmployeeDAOImpl;
import com.aaron.spring.springjdbc.employee.dto.Employee;

public class Test {
	public static void main(String[]args){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aaron/spring/springjdbc/employee/config.xml");
		EmployeeDAOImpl dao= (EmployeeDAOImpl) context.getBean("employeeDao");
//		Employee e1= new Employee();
//		e1.setFirstname("Karan");
//		e1.setLastname("Sun God");
//		e1.setId(3);
//		dao.create(e1);
//		dao.update(1, "Pikachu", "Ketchum");
		List<Employee> e1= dao.readItems();
		System.out.println(e1);
	}
}
