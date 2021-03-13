package com.nuagesync.edi.definition;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Children {
	@JsonProperty("maxOccurrence")
	int maxOccurrence;
	
	@JsonProperty("skipRowSuffix")
	boolean skipRowSuffix;
	
	@JsonProperty("Required")
	boolean required;
	
	@JsonProperty("container")
	boolean container;
	
	@JsonProperty("elements")
	Map<String, String> elements;
	
	@JsonProperty("children")
	Children children;
	
	@JsonProperty("closeRule")
	CloseRule closeRule;

	public int getMaxOccurrence() {
		return maxOccurrence;
	}

	public void setMaxOccurrence(int maxOccurrence) {
		this.maxOccurrence = maxOccurrence;
	}

	public boolean isSkipRowSuffix() {
		return skipRowSuffix;
	}

	public void setSkipRowSuffix(boolean skipRowSuffix) {
		this.skipRowSuffix = skipRowSuffix;
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

	public Map<String, String> getElements() {
		return elements;
	}

	public void setElements(Map<String, String> elements) {
		this.elements = elements;
	}

	public Children getChildren() {
		return children;
	}

	public void setChildren(Children children) {
		this.children = children;
	}

	public CloseRule getCloseRule() {
		return closeRule;
	}

	public void setCloseRule(CloseRule closeRule) {
		this.closeRule = closeRule;
	}
}
