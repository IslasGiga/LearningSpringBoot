package com.example.learning.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}



}
