package com.luv2code.springdemo.exception;

public class CustomerErrorResponse {

	private String message;
	private int status;
	private long timestamp;
	
	public CustomerErrorResponse() {}

	public CustomerErrorResponse(int status, String message, long timestamp) {
		this.message = message;
		this.status = status;
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
