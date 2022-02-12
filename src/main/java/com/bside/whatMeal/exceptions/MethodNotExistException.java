package com.bside.whatMeal.exceptions;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MethodNotExistException extends RuntimeException{
    private String errorMessage;

    @Builder
    public MethodNotExistException(String message){
        this.errorMessage = message;
    }
}
