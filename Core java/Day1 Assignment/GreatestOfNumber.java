package com.sonata;

public class GreatestOfNumber {
	public static void main(String[]args) {
		int i=12;
		int j=25;
		int k=89;
		
		if (i>j && i>k) {
			System.out.println("The largest number is"+i);
		}
		else if(j>k) {
			System.out.println("The largest number is"+j);
		}else {
			System.out.println("The largest number is "+k);
		}
	}

}
