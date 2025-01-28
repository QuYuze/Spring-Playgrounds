package com.yuze.springboot.playground.employeeManager.exceptions;

public class UserNotFoundEceptions extends RuntimeException{
    public UserNotFoundEceptions(String message){
        super(message);
    }
}
