package com.example.learning;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.learning.domain.Category;
import com.example.learning.domain.City;
import com.example.learning.domain.Product;
import com.example.learning.domain.State;
import com.example.learning.repository.CategoryRepository;
import com.example.learning.repository.CityRepository;
import com.example.learning.repository.ProductRepository;
import com.example.learning.repository.StateRepository;

@SpringBootApplication
public class LearningApplication implements CommandLineRunner{
	
	@Autowired
	CategoryRepository catRepo;
	
	@Autowired
	ProductRepository prodRepo;
	
	@Autowired
	CityRepository cityRepo;
	
	@Autowired
	StateRepository stateRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		Product p1 = new Product(null, "Computador", 2000);
		Product p2 = new Product(null, "Impressora", 800);
		Product p3 = new Product(null, "Mouse", 100);
		
		
		State state1 = new State(null, "Minas Gerais");
		State state2 = new State(null, "São Paulo");
		
		City city1 = new City(null, "Uberlandia", state1);
		City city2 = new City(null, "São Paulo", state2);
		City city3 = new City(null, "Campinas", state2);
		
		state1.getCities().addAll(Arrays.asList(city1));
		state2.getCities().addAll(Arrays.asList(city2, city3));
		
		
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
		
		
		catRepo.saveAll(Arrays.asList(cat1, cat2));
		prodRepo.saveAll(Arrays.asList(p1, p2, p3));
		stateRepo.saveAll(Arrays.asList(state1, state2));
		cityRepo.saveAll(Arrays.asList(city1, city2, city3));
		
	}

}
