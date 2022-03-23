package com.cg.eis.service;

import java.util.Scanner;

interface EmployeeService
{

}
public class Service implements EmployeeService{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id;
		double salary;
		String name, designation,insuranceScheme;
		
		System.out.println("Enter id");
		id = sc.nextInt();
	
		System.out.println("Enter salary");
		salary = sc.nextDouble();
		
		System.out.println("Enter name");
		name = sc.next();
		
		System.out.println("Enter designation");
		designation = sc.next();

		if(salary>1000000)
			insuranceScheme="SUPER DELUX";
		else
			insuranceScheme="DELUX";
		
		System.out.println("ID= "+id);
		System.out.println("NAME= "+name);
		System.out.println("SALARY= "+salary);
		System.out.println("DESIGNATION= "+designation);
		System.out.println("INSURANCE= "+ insuranceScheme);
	}
}
