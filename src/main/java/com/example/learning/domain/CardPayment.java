package com.example.learning.domain;

import javax.persistence.Entity;

import com.example.learning.domain.enums.PaymentState;

@Entity
public class CardPayment extends Payment{
	
	private static final long serialVersionUID = 1L;
	
	private Integer numberOfInstallments;
	
	public CardPayment() {}

	public CardPayment(Integer id, PaymentState state, Request request, Integer numberOfInstallments) {
		super(id, state, request);
		this.numberOfInstallments = numberOfInstallments;
		
	}

	public Integer getNumberOfInstallments() {
		return numberOfInstallments;
	}

	public void setNumberOfInstallments(Integer numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}
	
	
	
}
