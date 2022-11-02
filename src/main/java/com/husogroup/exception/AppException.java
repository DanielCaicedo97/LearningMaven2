package com.husogroup.exception;

public class AppException extends Exception {

	private static final long serialVersionUID = -4164516315541350790L;

	ExceptionDetails details;

	public AppException(Exception e) {
		super(e);
	}

	public AppException(String message) {
		super(message);
	}

	public AppException(String message, ExceptionDetails details) {
		super(message);
		setDetails(details);

	}

	public ExceptionDetails getDetails() {
		return details;
	}

	public void setDetails(ExceptionDetails details) {
		this.details = details;
	}

}
