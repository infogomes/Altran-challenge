package com.infogomes.countryapi.resource.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

public class StandardError implements Serializable{

	private static final long serialVersionUID = 2743051327476693607L;

	private LocalDateTime timestamp;
	private Integer status;
	private String message;
	private String path;

	public StandardError() {
	}

	public StandardError(LocalDateTime timestamp, Integer status, String message, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
		this.path = path;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
