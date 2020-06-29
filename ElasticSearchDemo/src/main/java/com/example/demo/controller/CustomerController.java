package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Items;
import com.example.demo.repository.CustomerRepo;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepo repo;

	@PostMapping("/saveItems")
	public String getAllCustomer(@RequestBody Items items) {
		repo.save(items);
		return "Successfully added";
		
		
	}
	
	@GetMapping("/getAll")
	public Iterable<Items> saveCustomer() {
		return repo.findAll();
		
		
		
	}
}
