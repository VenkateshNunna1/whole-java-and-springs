package com.jsp.hibernate_demo;

import java.util.Scanner;

public class EmployeeController {

	public static void main(String[] args) {
		Employee employee = new Employee();
		EmployeeDao ed = new EmployeeDao();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter id:");
         int id = in.nextInt();
         System.out.println("Enter name:");
         String name = in.next();
         System.out.println("Enter role:");
         String role = in.next();
          employee.setId(id);
          employee.setName(name);
          employee.setRoll(role);
          ed.SaveData(employee);
	}

}
