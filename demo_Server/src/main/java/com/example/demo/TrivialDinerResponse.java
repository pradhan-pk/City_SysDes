package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A Trivial Diner Response.
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrivialDinerResponse {

	/**open or closed**/
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}