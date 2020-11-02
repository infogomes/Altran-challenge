package com.infogomes.countryapi.resource.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<StandardError> getHttpClientError(HttpClientErrorException e, HttpServletRequest request) {
		StandardError error = new StandardError(LocalDateTime.now(), e.getStatusCode().value(), e.getMessage(),
				request.getRequestURI());
		return ResponseEntity.status(e.getStatusCode()).body(error);
	}

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<StandardError> validation(ConstraintViolationException e, HttpServletRequest request) {

		ValidationError err = new ValidationError(LocalDateTime.now(), HttpStatus.UNPROCESSABLE_ENTITY.value(),
				e.getMessage(), request.getRequestURI());

		for (@SuppressWarnings("rawtypes") ConstraintViolation x : e.getConstraintViolations()) {
			err.addError(x.getPropertyPath().toString().split("\\.")[1], x.getMessage());
		}

		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(err);
	}
}
