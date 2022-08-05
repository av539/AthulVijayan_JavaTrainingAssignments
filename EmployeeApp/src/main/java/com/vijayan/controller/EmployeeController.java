package com.vijayan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vijayan.model.Employee;
import com.vijayan.repo.EmployeeRepo;
import com.vijayan.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService service;
	
	
	@GetMapping("/employee")
	public List<Employee> listAllEmp()
	{
		List <Employee> list = service.getAllEmp();
		return list;
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> listByEmployeeId(@PathVariable Integer id)
	{
		Optional<Employee> emp = service.getEmpById(id);
		return emp;
	}
	
	@PostMapping("/employees")
	public void addEmp(@RequestBody Employee emp)
	{
		service.addEmp(emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Integer id)
	{
		service.deleteEmp(id);
	}
	
	@PutMapping("/employee")
	public void updateEmployee(@RequestParam Integer id , @RequestBody Employee emp)
	{
		service.updateEmp(id,emp);
	}
	

	
}
