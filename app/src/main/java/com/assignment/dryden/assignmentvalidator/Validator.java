package com.assignment.dryden.assignmentvalidator;
public class Validator {
    public static int validate(String password){
        int result = 0;
        if(password.length() > 7)
            result++;
        if(!password.toLowerCase().equals("password"))
            result++;
        return result;
    }
}