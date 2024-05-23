package com.enviro.assesment.grad001.jadamathele.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DataNotFoundException extends  RuntimeException{

	public DataNotFoundException(String message) {
        super(message);
    }

}
