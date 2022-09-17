package com.aaron.spring.springjdbc.employee.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.aaron.spring.springjdbc.employee.EmployeeRowMapper;
import com.aaron.spring.springjdbc.employee.dao.EmployeeDAO;
import com.aaron.spring.springjdbc.employee.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jdbc;

	@Override
	public void create(Employee employee) {

		String sql = "insert into employee values(?,?,?)";
		int result = getJdbc().update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		System.out.println(result + " rows were updated.");

	}

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	
	@Override
	public void update(int id, String firstname, String lastname) {
		
		String sql = "UPDATE employee SET firstname=?, lastname=? where id=? ";
		int result = getJdbc().update(sql, firstname, lastname, id);
		System.out.println(result + " rows were updated.");

	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM employee WHERE id=?";
		int result = getJdbc().update(sql,id);
		System.out.println(result + " rows were deleted.");

	}
	
	@Override
	public Employee read(int id) {
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		String sql="SELECT * FROM employee WHERE id = ?";
		return jdbc.queryForObject(sql,rowMapper,id);
		
	}

	@Override
	public List<Employee> readItems() {
		String sql="SELECT * FROM employee";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		return jdbc.query(sql, rowMapper);
		
	}

}
