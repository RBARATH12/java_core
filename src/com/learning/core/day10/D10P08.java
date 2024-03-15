package com.learning.core.day10;

public class D10P08 extends Exception{
	 public int mul(int a, int b) {

		   return a*b;

	   }

	   public int div(int a,int b) throws ArithmeticException{

		   try {

			   return a/b;

		   }catch(ArithmeticException e) {

			   return -0;

		   }
}
}