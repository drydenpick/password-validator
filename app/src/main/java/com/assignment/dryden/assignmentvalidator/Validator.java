package com.assignment.dryden.assignmentvalidator;
public class Validator {
    public static int validate(String password){
        int result = 0;
        if(password.length() > 7)
            result++;
        if(!password.toLowerCase().equals("password"))
            result++;
        if(!password.toLowerCase().equals(password))
            result++;
        if(!password.toUpperCase().equals(password))
            result++;
        if(password.contains("0") || password.contains("1") || password.contains("2")
                || password.contains("3") || password.contains("4") || password.contains("5")
                || password.contains("6") || password.contains("7") ||  password.contains("8")
                || password.contains("9"))
            result++;
        return result;
    }
}