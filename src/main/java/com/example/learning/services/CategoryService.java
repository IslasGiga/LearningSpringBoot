package com.example.learning.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning.domain.Category;
import com.example.learning.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Category search(Integer id) {
		Optional<Category> cat = repo.findById(id);
		return cat.orElse(null); 
	}
}
