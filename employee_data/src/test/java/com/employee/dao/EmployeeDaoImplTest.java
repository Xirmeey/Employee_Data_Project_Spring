/**
 * 
 */
package com.employee.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.entity.Employee;



/**
 * @author OHIS
 *
 */
@Sql(scripts = {"classpath:/db/create-table.sql","classpath:/db/insert-employees.sql"})
@ContextConfiguration("classpath:data-context.xml")
@RunWith(SpringRunner.class)
public class EmployeeDaoImplTest {
	
	
	@Autowired
	private Environment env;

	@Autowired
	EmployeeDao employeeDaoImpl;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	
	@Test
	public void saveEmployeeToDBTest() {
		
		Employee newEmployee = new Employee();
		newEmployee.setFirstName("Samuel");
		newEmployee.setLastName("Iruedo");
		newEmployee.setEmail("iruedosamuel@gmail.com");
		newEmployee.setPhoneNumber("07062884086");
		
		Date employeeDate = Date.valueOf("2000-07-24");
		
		newEmployee.setDateofBirth(employeeDate);
		
		assertThat(employeeDaoImpl).isNotNull();
		
		employeeDaoImpl.saveEmployee(newEmployee);
		
		int id = newEmployee.getEmployeeId();
		Employee existingEmployee = employeeDaoImpl.getById(id);
		assertThat(existingEmployee).isNotNull();
}   

	@Test
	public void getEmployeeByEmailTest() {
		assertThat(employeeDaoImpl).isNotNull();
		Employee savedEmployee = employeeDaoImpl.getByEmail("sinarambo@gmail.com");
		assertThat(savedEmployee).isNotNull();
		assertThat(savedEmployee.getEmployeeId()).isEqualTo(2);
		System.out.println(savedEmployee);
		
	}

}
