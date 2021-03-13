package com.nuagesync.edi.definition;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BEGDefinition {
	@JsonProperty("name")
	String name;
	
	@JsonProperty("maxOccurrence")
	int maxOccurrence;
	
	@JsonProperty("required")
	boolean required;
	
	@JsonProperty("container")
	boolean container;
	
	@JsonProperty("elements")
	List<Elements> elements;
	
	@JsonProperty("children")
	List<Children> children;
	
	@JsonProperty("closeRule")
	CloseRule closeRule;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxOccurrence() {
		return maxOccurrence;
	}

	public void setMaxOccurrence(int maxOccurrence) {
		this.maxOccurrence = maxOccurrence;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public boolean isContainer() {
		return container;
	}

	public void setContainer(boolean container) {
		this.container = container;
	}

	public List<Elements> getElements() {
		return elements;
	}

	public void setElements(List<Elements> elements) {
		this.elements = elements;
	}

	public List<Children> getChildren() {
		return children;
	}

	public void setChildren(List<Children> children) {
		this.children = children;
	}

	public CloseRule getCloseRule() {
		return closeRule;
	}

	public void setCloseRule(CloseRule closeRule) {
		this.closeRule = closeRule;
	}
	
	
}
