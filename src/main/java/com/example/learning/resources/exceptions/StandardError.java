package com.example.learning.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{


	private static final long serialVersionUID = 1L;
	private Integer status;
	private String message;
	private long timestap;
	
	public StandardError(Integer status, String message, long timestap) {
		super();
		this.status = status;
		this.message = message;
		this.timestap = timestap;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestap() {
		return timestap;
	}

	public void setTimestap(long timestap) {
		this.timestap = timestap;
	}
	
	
}
