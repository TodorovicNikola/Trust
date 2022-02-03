package com.trust.service.exception;

@SuppressWarnings("serial")
public class EntityNotExistsException extends RuntimeException {

	public EntityNotExistsException(String message) {
		super(message);
	}
}
