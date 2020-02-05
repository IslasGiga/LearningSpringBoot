package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{
	
}
