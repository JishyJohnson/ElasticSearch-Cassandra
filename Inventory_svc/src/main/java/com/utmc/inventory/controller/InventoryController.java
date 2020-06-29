package com.utmc.inventory.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utmc.inventory.model.Items;
import com.utmc.inventory.repository.InventoryRepo;

@RestController
@RequestMapping("/inventory-svc/items")
public class InventoryController {

	@Autowired
	InventoryRepo repo;

	@GetMapping("/getAllItems")
	public List<Items> getAllItems() {

		return repo.findAll();
	}

	/*
	 * @PostConstruct public void saveItems() { List<Items> item = new
	 * ArrayList<Items>(); item.add(new Items(100, "test", 120)); item.add(new
	 * Items(101, "ttt", 2120)); repo.saveAll(item); }
	 */
	@PostMapping
	public void updateItem(@RequestBody Items item) {
		repo.save(item);
		
		
	}
	
}
