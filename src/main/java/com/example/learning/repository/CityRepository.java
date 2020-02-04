package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{
	
}
