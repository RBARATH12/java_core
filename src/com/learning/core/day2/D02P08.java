package com.learning.core.day2;

import java.util.Scanner;

public class D02P08 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int L=sc.nextInt();
		 int R=sc.nextInt();
		 int sum=0;
		 if(L>=0 && R>=0) {
			 for(int i=L;i<=R;i++) {
				 sum=sum+i;
			 }
		 }
		 System.out.println(sum);

	}

}
