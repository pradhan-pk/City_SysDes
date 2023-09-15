package com.example.demo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A trivial client response to map the diner response properties.
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrivialClientResponse {

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private String status;

}