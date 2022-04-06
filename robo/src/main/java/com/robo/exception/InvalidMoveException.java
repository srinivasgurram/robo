package com.robo.exception;

/**
 * Custom exception class
 * 
 * @author sgurram
 *
 */
public class InvalidMoveException extends RuntimeException {
	
	private static final long serialVersionUID = 3166642805967211983L;

	public InvalidMoveException(String message) {
		super(message);
	}

}
