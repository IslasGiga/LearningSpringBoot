package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.domain.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer>{
	
}
