package com.assignment.dryden.assignmentvalidator;
public class Validator {

    //Besides the default rules, my validator requires an upper and lower case character and a Number.
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
        if(password.matches(".*\\d+.*"))
            result++;
        return result;
    }
}