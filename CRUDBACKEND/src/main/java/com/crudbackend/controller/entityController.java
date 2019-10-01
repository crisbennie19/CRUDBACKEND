package com.crudbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudbackend.model.dbEntity;
import com.crudbackend.repository.entityRepo;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")

public class entityController {

	@Autowired 
	private entityRepo crudRepo;
	
	//List all items
	@GetMapping("/lists")
	public List<dbEntity> getList(){
		return crudRepo.findAll();
		
	}
	
	//list only one item
	
	@GetMapping("/list/{id}")
	public ResponseEntity<dbEntity> listOne(@PathVariable Long id ) {
	 
		Optional<dbEntity> getOneData = crudRepo.findById(id);
		if(getOneData.isPresent()) {
			return new ResponseEntity<>(getOneData.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
   // Update item
	
	@PutMapping("/list")
	public dbEntity updateList(@RequestBody dbEntity entity) {
		return crudRepo.save(entity);
	}
	
	// Save item
	@PostMapping ("/saveList")
	
	public dbEntity saveList(@RequestBody dbEntity list) {
		
	return crudRepo.save(list);
	}
	//Delete item
	
	@DeleteMapping("/deleteList/{id}")
	public boolean deleteList(@PathVariable long id ) {
		 crudRepo.deleteById(id);
		return true;
	}
	
	}
	

