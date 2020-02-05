package com.example.learning.domain.enums;

public enum ClientType {

	INDIVIDUAL(1, "Pessoa física"), CORPOTATIVE(2, "Pessoa jurídica");

	private int code;
	private String description;

	private ClientType(int code, String description) {
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
	
	public static ClientType toEnum(Integer code) {
		if(code == null) 
			return null;
		
		for(ClientType t : ClientType.values()) {
			if (code.equals(t.getCode())) {
				return t;
			}
		}
		throw new IllegalArgumentException("Invalid code: " + code);
	}

	
	
}
