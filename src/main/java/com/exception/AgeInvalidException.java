package com.exception;

/**
 * this class is for custom exception
 * @author chandan
 *
 */
public class AgeInvalidException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public AgeInvalidException(String message) {
		super(message);
	}
	
}
