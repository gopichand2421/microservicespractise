package com.student.service.exceptionhandlers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorResponse {

    private int statusCode;
    private String message;

    public ErrorResponse(String message){
        super();
        this.message = message;
    }
}
