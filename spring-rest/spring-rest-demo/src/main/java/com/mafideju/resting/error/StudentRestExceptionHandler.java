package com.mafideju.resting.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StudentError> handleException(StudentNotFoundException e) {
		
		StudentError studentError = new StudentError();
		studentError.setStatus(404);
		studentError.setMessage(e.getMessage());
		studentError.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<StudentError>(studentError, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentError> handleException(Exception e) {
		
		StudentError studentError = new StudentError();
		studentError.setStatus(HttpStatus.BAD_REQUEST.value());
		studentError.setMessage(e.getMessage());
		studentError.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<StudentError>(studentError, HttpStatus.BAD_REQUEST);
	}
}
