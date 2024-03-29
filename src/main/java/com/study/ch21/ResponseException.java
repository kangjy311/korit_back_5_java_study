package com.study.ch21;

import lombok.Getter;

import java.util.Map;

@Getter
public class ResponseException extends RuntimeException{
    private Map<String, Object> errorMap;

    public ResponseException(String message) {      //에러 메세지만뜨게
        super(message);
    }

    public ResponseException(String message, Map<String, Object> errorMap) {
        super(message);     //super  -부모객체생성
        this.errorMap = errorMap;
    }
}
