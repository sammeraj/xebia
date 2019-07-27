package com.xebia.model;


public enum UserType {

	EMPLOYEE("employee"),
	AFFILIATE("affiliate");
	private String value;

	UserType(String value){
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static UserType fromString(String value) {
		for (UserType b : UserType.values()) {
			if (b.value.equalsIgnoreCase(value)) {
				return b;
			}
		}
		return null;
	}
}
