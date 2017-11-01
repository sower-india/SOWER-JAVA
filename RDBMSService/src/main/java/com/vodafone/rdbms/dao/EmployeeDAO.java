package com.vodafone.rdbms.dao;

import java.util.List;

import com.vodafone.rdbms.pojo.Employee;

public interface EmployeeDAO {

		List<Employee> findAll();
	    List<Employee> findById();
	    List<Employee> findByName();
	    boolean insertEmployee(Employee employee);
	    boolean updateEmployee(Employee employee);
	    boolean deleteEmployee(Employee employee);
	
}
