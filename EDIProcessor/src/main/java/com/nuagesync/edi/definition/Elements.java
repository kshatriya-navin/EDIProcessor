package com.nuagesync.edi.definition;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Elements {

	@JsonProperty("name")
	String name;
	
	@JsonProperty("value")
	String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
