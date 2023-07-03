package com.dorukbiyikli.exceptions;

import lombok.Getter;


@Getter
public class RandevuException extends RuntimeException{
    private final ErrorType errorType;

    public RandevuException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }
    public RandevuException(ErrorType errorType,String message){
        super(errorType.getMessage());
        this.errorType=errorType;
    }
}
