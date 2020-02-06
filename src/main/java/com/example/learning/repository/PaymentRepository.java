package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.domain.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{
	
}
