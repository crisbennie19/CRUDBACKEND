package com.crudbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crudbackend.model.dbEntity;
import com.crudbackend.repository.entityRepo;

@SpringBootApplication
public class CrudbackendApplication  {
   
    
    	
	public static void main(String[] args) {
		
		
		SpringApplication.run(CrudbackendApplication.class, args);
	}



	

}
