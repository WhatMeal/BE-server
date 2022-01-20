package com.bside.whatMeal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //REST API를 사용할 경우 쓰는 advicer -> global하게 예외 잡기
public class ApiExcpetionAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiExceptionEntity> methodNotExistException(MethodNotExistException e){
        //잘못된 선택지의 값이 들어왔을 때의 exception
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ApiExceptionEntity.builder().errorCode(HttpStatus.BAD_REQUEST.toString())
                        .errorMessage("존재하지 않는 선택지입니다.").build());
    }
}
