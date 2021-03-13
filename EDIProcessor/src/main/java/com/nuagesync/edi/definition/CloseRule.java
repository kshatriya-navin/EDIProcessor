package com.nuagesync.edi.definition;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nk671137
 *
 */
public class CloseRule {

	@JsonProperty("maxOccurrence")
	int maxOccurrence;
	
	@JsonProperty("description")
	String description;
	
	@JsonProperty("required")
    boolean required;
    
	@JsonProperty("elements")
    List<Elements> elements;

	public int getMaxOccurrence() {
		return maxOccurrence;
	}

	public void setMaxOccurrence(int maxOccurrence) {
		this.maxOccurrence = maxOccurrence;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public List<Elements> getElements() {
		return elements;
	}

	public void setElements(List<Elements> elements) {
		this.elements = elements;
	}
}
