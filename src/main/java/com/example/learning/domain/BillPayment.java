package com.example.learning.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.example.learning.domain.enums.PaymentState;

@Entity
public class BillPayment extends Payment{
	
	private static final long serialVersionUID = 1L;
	private Date endDate;
	private Date paymentDate;
	
	public BillPayment(){}

	public BillPayment(Integer id, PaymentState state, Request request, Date endDate, Date paymentDate) {
		super(id, state, request);
		this.endDate = endDate;
		this.paymentDate = paymentDate;
		// TODO Auto-generated constructor stub
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
	
}
