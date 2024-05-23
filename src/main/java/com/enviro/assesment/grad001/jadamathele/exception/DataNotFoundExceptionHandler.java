package com.enviro.assesment.grad001.jadamathele.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class DataNotFoundExceptionHandler {

	 @ExceptionHandler(DataNotFoundException.class)
	    public ResponseEntity<Map<String, Object>> handleCustomException(DataNotFoundException ex) {
	        Map<String, Object> errorResponse = new HashMap<>();
	        errorResponse.put("timestamp", Instant.now().toString());
	        errorResponse.put("message", ex.getMessage());
	        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	    }
}
