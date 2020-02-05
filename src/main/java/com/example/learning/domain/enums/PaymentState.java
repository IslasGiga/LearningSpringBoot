package com.example.learning.domain.enums;

public enum PaymentState {
	PENDING(1, "Pendente"),
	SETTLED(2, "Quitado"),
	CANCELED(3, "Cancelado");

	private int code;
	private String description;
	
	private PaymentState(int code, String description) {
		this.setCode(code);
		this.setDescription(description);
	}

	public int getCode() {
		return code;
	}

	private void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}
	
	public static PaymentState toEnum(Integer code) {
		if(code == null) 
			return null;
		
		for(PaymentState t : PaymentState.values()) {
			if (code.equals(t.getCode())) {
				return t;
			}
		}
		throw new IllegalArgumentException("Invalid code: " + code);
	}

	
	



}
