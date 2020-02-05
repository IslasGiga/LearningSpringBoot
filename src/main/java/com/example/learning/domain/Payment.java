package com.example.learning.domain;

import java.io.Serializable;

import com.example.learning.domain.enums.PaymentState;

public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	private PaymentState state;
	private Request request;
	
	
	public Payment() {}


	public Payment(Integer id, PaymentState state, Request request) {
		super();
		this.id = id;
		this.state = state;
		this.request = request;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public PaymentState getState() {
		return state;
	}


	public void setState(PaymentState state) {
		this.state = state;
	}


	public Request getRequest() {
		return request;
	}


	public void setRequest(Request request) {
		this.request = request;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}