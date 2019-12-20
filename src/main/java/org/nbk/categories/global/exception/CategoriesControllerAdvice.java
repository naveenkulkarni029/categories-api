package org.nbk.categories.global.exception;

import org.nbk.categories.exception.NotFoundException;
import org.nbk.categories.response.domain.ServiceError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CategoriesControllerAdvice {
	
	@ExceptionHandler(value= {NotFoundException.class})
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ServiceError handleServiceError(NotFoundException exception) {
		//return new ServiceError(HttpStatus.NOT_FOUND, exception.getMessage());
		return new ServiceError(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND, exception.getMessage());
	}
	

}
