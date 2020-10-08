package com.techelevator.auditreport;

public class ReportExistsException extends Exception {
	
	private int errorCode;
	
	public ReportExistsException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}
	
	

}
