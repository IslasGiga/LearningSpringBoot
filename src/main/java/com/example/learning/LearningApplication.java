package com.example.learning;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.learning.domain.Category;
import com.example.learning.repository.CategoryRepository;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@SpringBootApplication
public class LearningApplication implements CommandLineRunner{
	
	@Autowired
	CategoryRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		repo.saveAll(Arrays.asList(cat1, cat2));
	}

}
