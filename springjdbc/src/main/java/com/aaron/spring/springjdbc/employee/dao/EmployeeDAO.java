package com.aaron.spring.springjdbc.employee.dao;

import java.util.List;

import com.aaron.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDAO {
	void create(Employee employee);
	void update(int id, String firstname, String lastname);
	void delete(int id);
	Employee read(int id);
	List<Employee> readItems();
	
}
