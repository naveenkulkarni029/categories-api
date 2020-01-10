package org.nbk.categories.global.exception;

import org.nbk.categories.exception.NotFoundException;
import org.nbk.categories.response.domain.ServiceError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CategoriesControllerAdvice {

	@ExceptionHandler(value = { NotFoundException.class })
	public ResponseEntity<ServiceError> handleServiceError(NotFoundException exception) {
		ServiceError serviceError = new ServiceError(HttpStatus.NOT_FOUND.toString(), exception.getMessage(),
				exception.getUri());
		return new ResponseEntity<ServiceError>(serviceError, HttpStatus.NOT_FOUND);
	}
}
