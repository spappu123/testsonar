package com.mysonar;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
public class EmployeeServiceImplTest {
	
	
	private EmployeeServiceImpl employeeServiceImpl;
	
	 @Before  
	 public void setUp() throws Exception {  
		employeeServiceImpl=new EmployeeServiceImpl();
	 }  
	
	@Test
	public void testGetEmployeeData() {
		List<String> emps=employeeServiceImpl.getEmployeeData();
		assertNotNull(emps);
	}


}
