package com.learning.core.day10;

public class D10P10 {

	 public boolean validateUsername(String name) {

	        if (name == null || name.isEmpty()) {

	            return false;

	        }

	        return name.matches("^[a-zA-Z]+$"); // Only characters allowed

	    }



	    public boolean validatePassword(String password) {

	        if (password == null || password.length() < 8) {

	            return false;

	        }

	        return password.matches("^(?=.*[0-9])(?=.*[a-zA-Z]).+$"); // At least one digit and one alphabet

	    }

}