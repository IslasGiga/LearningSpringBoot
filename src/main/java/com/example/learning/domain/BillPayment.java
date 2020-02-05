package com.example.learning.domain;

import java.util.Date;

import com.example.learning.domain.enums.PaymentState;

public class BillPayment extends Payment{
	
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
