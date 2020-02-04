package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.domain.Category;
import com.example.learning.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
