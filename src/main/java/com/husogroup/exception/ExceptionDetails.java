package com.husogroup.exception;

public class ExceptionDetails {

	private String key;
	private SeverityEnum severityEnum;

	public ExceptionDetails(String key, SeverityEnum severityEnum) {
		super();
		this.key = key;
		this.severityEnum = severityEnum;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public SeverityEnum getSeverityEnum() {
		return severityEnum;
	}

	public void setSeverityEnum(SeverityEnum severityEnum) {
		this.severityEnum = severityEnum;
	}

}
