package com.java;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee
{
	int empId;
	String empName;
	int empAge;
	String empGender;
	String empDept;
	int empYearOfJoining;
	int empSal;
	
}


public class EmployeeInfo 
{
	public static void main(String[] args)
	{
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1,"Harry Potter",27,"male","Department of Magical Law Enforcement",2009,85000));
		emp.add(new Employee(2,"Hermione Granger",27,"female","Department of Magical Education",2009,90000));
		emp.add(new Employee(3,"Ronald Weasley",28,"male","Department of Magical Law Enforcement",2010,80000));
		emp.add(new Employee(4,"Neville Longbottom",27,"male","Department of Magical Transportation",2011,75000));
		emp.add(new Employee(5,"Luna Lovegood",26,"female","Department of Mysteries",2010,85000));
		emp.add(new Employee(6,"Ginny Weasley",26,"female","Department of Magical Law Enforcement",2016,80000));
		emp.add(new Employee(7,"Romilda Vane",25,"female","Department of Magical Transportation",2018,40000));
		emp.add(new Employee(8,"Draco Malfoy",28,"male","Department of Magical Transportation",2017,80000));
		emp.add(new Employee(9,"Tom Riddle",65,"male","Department of Maintenance",1965,60000));
		emp.add(new Employee(10,"Bellatrix Lestrange",45,"female","Department of Maintenance",1984,55000));
		emp.add(new Employee(11,"Lucius Malfoy",52,"male","Department of Maintenance",1982,40000));



		
		// Finding the number of male and female employees in list
		long maleCount = emp.stream().filter(e -> e.empGender.equals("male")).count();
		System.out.println("The number of male employees is: " + maleCount);
		
		long femaleCount = emp.stream().filter(e -> e.empGender.equals("female")).count();
		System.out.println("The number of female employees is: " + femaleCount);
		
	 	System.out.println("-----------------------------------------------------------------------------------------------------------");

		
		
		// Finding average age of male and female employees
		List<Employee> maleEmployees = emp.stream().filter(e -> e.empGender.equals("male")).collect(Collectors.toList());
	 	double maleAgeSum =  maleEmployees.stream().mapToDouble(e -> e.empAge).sum();
	 	double maleAgeAvg =  maleAgeSum / maleEmployees.size();
	 	System.out.println("The average age for all male employees is: " + Math.round(maleAgeAvg));
	 	
	 	List<Employee>femaleEmployees = emp.stream().filter(e -> e.empGender.equals("female")).collect(Collectors.toList());
	 	double femaleAgeSum = femaleEmployees.stream().mapToDouble(e -> e.empAge).sum();
	 	double femaleAgeAvg =  femaleAgeSum / femaleEmployees.size();
	 	System.out.println("The average age for all female employees is: " + Math.round(femaleAgeAvg));
	 	
	 	System.out.println("-----------------------------------------------------------------------------------------------------------");

	 	// Find highest paid employee in organization
	 	int highestPaid = emp.stream().mapToInt(e-> e.empSal).max().getAsInt();
	 	String name="";
	 	for(Employee e : emp)
	 	{
	 		if(e.empSal == highestPaid)
	 		{
	 			name = e.getEmpName();
	 		}
	 	}
	 	System.out.println("The highest paid employee is: " + name);
	 	
	 	System.out.println("-----------------------------------------------------------------------------------------------------------");

	 	//List name of employees who joined after 2016
	 	//**Note: outputted list onto two seperate lines to make it easier to read
//	 	List<Employee> employeesAfter2016 = emp.stream().filter(e -> e.empYearOfJoining > 2015).collect(Collectors.toList());
//	 	for(int i=0; i<employeesAfter2016.size(); i++)
//	 	{
//	 		System.out.println(employeesAfter2016.get(i));
//	 	}
	 	
	 	emp.stream().filter(e -> e.empYearOfJoining > 2015).collect(Collectors.toList()).forEach(System.out::println);
	 	
	 	System.out.println("-----------------------------------------------------------------------------------------------------------");

	 	
	 	// Finding the most senior employee within organization
	 	int highestAge = emp.stream().mapToInt(e -> e.empAge).max().getAsInt();
	 	String nameForHighestAge = "";
	 	for(Employee e : emp)
	 	{
	 		if(e.empAge == highestAge)
	 		{
	 			nameForHighestAge = e.getEmpName();
	 		}
	 	}
	 	System.out.println("The oldest employee in this organization is: " + nameForHighestAge);
	 	
	 	System.out.println("-----------------------------------------------------------------------------------------------------------");
	 	
	 	// Counting the number of employees in each department
	 	long depOfMLECount = emp.stream().filter(e -> e.empDept.equals("Department of Magical Law Enforcement")).count();
	 	long depOfMECount = emp.stream().filter(e -> e.empDept.equals("Department of Magical Education")).count();
	 	long depOfMCount = emp.stream().filter(e -> e.empDept.equals("Department of Mysteries")).count();
	 	long depOfMTCount = emp.stream().filter(e -> e.empDept.equals("Department of Magical Transportation")).count();
	 	long depOfMaintenanceCount = emp.stream().filter(e -> e.empDept.equals("Department of Maintenance")).count();


	 	System.out.println("The Department of Magical Law Enforcement has: " + depOfMLECount + " employees ");
	 	System.out.println("The Department of Magical Education has: " + depOfMECount + " employees ");
	 	System.out.println("The Department of Mysteries has: " + depOfMCount + " employees ");
	 	System.out.println("The Department of Magical Transportation: " + depOfMTCount + " employees ");
	 	System.out.println("The Department of Maintenance has : " + depOfMaintenanceCount + " employees ");


	 	System.out.println("-----------------------------------------------------------------------------------------------------------");
	 	
	 	//Finding male and female employees in the maintenenace department
	 	String employee = "";
	 	for(Employee e: emp)
	 	{
	 		if(e.empDept.equals("Department of Maintenance") && e.empGender.equals("male"))
	 		{
	 			employee = e.getEmpName();
	 			System.out.println(employee + " is a MALE employee that works in the Maintenance department");
	 		}
	 		
	 		else if(e.empDept.equals("Department of Maintenance") && e.empGender.equals("female"))
	 		{
	 			employee = e.getEmpName();
	 			System.out.println(employee + " is a FEMALE employee that works in the Maintenance department");	
	 		}

	 	}
	 	
	 	System.out.println("-----------------------------------------------------------------------------------------------------------");

	 	
	 	// Finding the average salary between male and female employees
	 	double maleSalSum =  maleEmployees.stream().mapToDouble(e -> e.empSal).sum();
	 	double maleSalAvg =  maleSalSum / maleEmployees.size();
	 	System.out.println("The average salary for all male employees is: " + Math.round(maleSalAvg));
	 	
	 	double femaleSalSum = femaleEmployees.stream().mapToDouble(e -> e.empSal).sum();
	 	double femaleSalAvg =  femaleSalSum / femaleEmployees.size();
	 	System.out.println("The average salary for all female employees is: " + Math.round(femaleSalAvg));
	 	
	 	System.out.println("-----------------------------------------------------------------------------------------------------------");
	 	
	 	// Distinguishing Employees younger than or equal to 30 from employees that are above 25
	 	
	 	List<Employee> employeesAbove25 = emp.stream().filter(e -> e.empAge > 25).collect(Collectors.toList());
	 	List<Employee> empYoungerThanOrEqualto30 = employeesAbove25.stream().filter(e -> e.empAge <= 30).collect(Collectors.toList());
	 	
	 	System.out.println("The employees that are all above 25 years old are: ");
	 	
	 	for(Employee e: employeesAbove25)
	 	{
	 		System.out.println(e.getEmpName());
	 	}
	 	
	 	System.out.println();
	 	
	 	System.out.println("From those who are above 25, the employees that are less than or equal to 30 years old are: ");
		for(Employee e: empYoungerThanOrEqualto30)
	 	{
	 		System.out.println(e.getEmpName());
	 	}
		
	 	System.out.println("-----------------------------------------------------------------------------------------------------------");
	 	
	 	//Listing out names of employees in each department
	 	List<Employee> DeptOfMLE = emp.stream().filter(e -> e.empDept.equals("Department of Magical Law Enforcement")).collect(Collectors.toList());
	 	List<Employee> DeptOfME = emp.stream().filter(e -> e.empDept.equals("Department of Magical Education")).collect(Collectors.toList());
	 	List<Employee> DeptOfM = emp.stream().filter(e -> e.empDept.equals("Department of Mysteries")).collect(Collectors.toList());
	 	List<Employee> DeptOfMT = emp.stream().filter(e -> e.empDept.equals("Department of Magical Transportation")).collect(Collectors.toList());
	 	List<Employee> DeptOfMaintenance = emp.stream().filter(e -> e.empDept.equals("Department of Maintenance")).collect(Collectors.toList());
	 	
	 	System.out.println("Department Of Magical Law Enforcement");
	 	System.out.println("========================================");

	 	for(Employee e: DeptOfMLE)
	 	{
	 		System.out.println(e.getEmpName());
	 	}
	 	
	 	System.out.println();
	 	
	 	System.out.println("Department Of Magical Education");
	 	System.out.println("=================================");
		for(Employee e: DeptOfME)
	 	{
	 		System.out.println(e.getEmpName());
	 	}
	 	System.out.println();

	 	System.out.println("Department Of Mysteries");
	 	System.out.println("==================================");
		for(Employee e: DeptOfM)
	 	{
	 		System.out.println(e.getEmpName());
	 	}
	 	System.out.println();

	 	System.out.println("Department Of Magical Transportation");
	 	System.out.println("===================================");
		for(Employee e: DeptOfMT)
	 	{
	 		System.out.println(e.getEmpName());
	 	}
	 	System.out.println();

	 	System.out.println("Department of Maintenance");
	 	System.out.println("====================================");
		for(Employee e: DeptOfMaintenance)
	 	{
	 		System.out.println(e.getEmpName());
	 	}
	 
	}

}
