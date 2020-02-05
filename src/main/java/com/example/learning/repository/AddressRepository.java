package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
	
}
