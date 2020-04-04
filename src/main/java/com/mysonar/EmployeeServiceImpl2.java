package com.mysonar;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl2 {
	
	private List<String> getEmployeeNames(){
		
		List<String> employees =new ArrayList<>();
	    employees.add("srinivas");
	    employees.add("james");
	    return employees;
		
	}
	
	public List<String> getEmployeeData() {
			 return getEmployeeNames();
	}
	
	
	
}
