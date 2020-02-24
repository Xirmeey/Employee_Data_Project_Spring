/**
 * 
 */
package com.employee_service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

/**
 * @author OHIS
 *
 */
@ContextConfiguration("classpath:service-context.xml")
@RunWith(SpringRunner.class)
public class EmployeeServiceImplTest {
	
	@Mock
	private EmployeeDao employeeDaoImpl;

	
	@Before
	public void setUp() throws Exception {
		
		employeeDaoImpl = mock(EmployeeDao.class);
	}

	@Test
	public void saveEmployeeTest() {
		// create an object
		Employee tempEmployee = new Employee();
		
		// define a mock call
		doNothing().when(employeeDaoImpl).saveEmployee(isA(Employee.class));
		
		//make a mock call
		employeeDaoImpl.saveEmployee(tempEmployee);
		
		//verify the method was called
		verify(employeeDaoImpl, times(1)).saveEmployee(tempEmployee);
	}

}
