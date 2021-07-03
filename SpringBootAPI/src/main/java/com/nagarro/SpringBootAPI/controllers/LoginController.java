package com.nagarro.SpringBootAPI.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.SpringBootAPI.model.Employee;
import com.nagarro.SpringBootAPI.model.HRManager;
import com.nagarro.SpringBootAPI.repository.EmployeeRepository;
import com.nagarro.SpringBootAPI.repository.HRRepository;

@RestController
public class LoginController {

	@Autowired
	HRRepository repo;

	@Autowired
	EmployeeRepository emprepo;

	@GetMapping(path = "/login/{id}", produces = { "application/json" })
	public Optional<HRManager> getHRManager(@PathVariable(name = "id") String id) {
		return repo.findById(id);
	}

	@PostMapping(path = "/login")
	public Employee post(@RequestBody Employee h) {
		System.out.println(h);
		return emprepo.save(h);
	}

	@PutMapping(path = "/login")
	public Employee put(Employee h) {
		return emprepo.save(h);
	}

	@DeleteMapping(path = "/login/{id}")
	public void delete(@PathVariable("id") int id) {
		emprepo.deleteById(id);
	}

	@GetMapping(path = "/home")
	public List<Employee> getEmps() {
		return emprepo.findAll();
	}

	@GetMapping(path = "edit/{id}")
	public Optional<Employee> getEmp(@PathVariable("id") int id) {
		return emprepo.findById(id);
	}
}
