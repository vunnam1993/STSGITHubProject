package com.altimatric.logical.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class EmployeeSalaryChangeDesignaton {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("surendra", 50000, "software"));
		empList.add(new Employee("ramu", 60000, "software"));
		empList.add(new Employee("subbu", 50000, "software"));
		empList.add(new Employee("suresh", 40000, "software"));
		empList.add(new Employee("rajesh", 52000, "software"));
		empList.add(new Employee("rama", 70000, "software"));
		
		
		int employee=(int) empList.stream().filter(sal->sal.getSalary()>=50000).count();
		System.out.println(employee);
		/*
		 * for(Employee employee:empList) { if(employee.getSalary()>=50000) {
		 * 
		 * employee.setDesignation("Associate");
		 * 
		 * System.out.println(employee.getSalary()+"......."+employee.getDesignation());
		 * }
		 * 
		 * }
		 */

		/*
		 * for (int i = 0; i < empList.size(); i++) { if (empList.get(i).getSalary() >=
		 * 50000) { empList.get(i).setDesignation("Associate"); } }
		 */
		
		
		
	}
}
