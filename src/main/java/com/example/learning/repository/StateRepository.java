package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{
	
}
