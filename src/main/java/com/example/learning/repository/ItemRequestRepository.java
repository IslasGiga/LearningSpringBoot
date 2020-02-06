package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.domain.ItemRequest;

@Repository
public interface ItemRequestRepository extends JpaRepository<ItemRequest, Integer>{
	
}
