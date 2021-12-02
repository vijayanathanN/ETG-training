package com.sonata;

public class Sum_Value_of_an_Array {
	public static void main(String[]args) {
		int a[]= {1,3,5,7,8};
		int sum=0;
		for(int i:a) {
			
			sum = sum +i;
			System.out.println("The sum of the given array Number is "+sum);
			
		}
	}

}
