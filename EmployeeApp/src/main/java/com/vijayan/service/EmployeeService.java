package com.vijayan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijayan.model.Employee;
import com.vijayan.repo.EmployeeRepo;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepo employeeRepo;
	
	public List <Employee> getAllEmp()
	{
		return employeeRepo.findAll();
	}
	
	public Optional<Employee> getEmpById(int id)
	{
		return employeeRepo.findById(id);
	}
	
	public void deleteEmp(Integer id)
	{
		employeeRepo.deleteById(id);
	}
	
	public void addEmp(Employee emp)
	{
		employeeRepo.save(emp);
	}
	
	public void updateEmp (Integer id,Employee emp)
	{
		Optional<Employee>e = employeeRepo.findById(id);
		Employee employee = e.get();
		employee.setEmpId(emp.getEmpId());
		employee.setDesignation(emp.getDesignation());
		employee.setName(emp.getName());
		employee.setSalary(emp.getSalary());
		employeeRepo.save(employee);

	}
	
}
