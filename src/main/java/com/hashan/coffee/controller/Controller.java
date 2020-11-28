package com.hashan.coffee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hashan.coffee.entity.Coffee;
import com.hashan.coffee.exception.ResourceNotFound;
import com.hashan.coffee.repo.CoffeeRepo;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	private CoffeeRepo coffeeRepo;
	
	//get all
	@GetMapping
	public List<Coffee> getAll(){
		return this.coffeeRepo.findAll();
	}
	
	//update
	@PutMapping("/{id}")
	public Coffee updateOrder(@RequestBody Coffee coffee, @PathVariable ("id") int id) {
		
		Coffee exs = this.coffeeRepo.findById(id).orElseThrow(() -> new ResourceNotFound("Error"));
		exs.setOrder(coffee.getOrder());
		 this.coffeeRepo.save(exs);
		 
		 return this.coffeeRepo.save(exs);
		
	}
}
