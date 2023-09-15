package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A trivial client request to map the diner request properties.
 * 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrivialClientRequest {

	private String day;

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

}