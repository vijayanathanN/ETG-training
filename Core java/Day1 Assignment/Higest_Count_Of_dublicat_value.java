package com.sonata;

public class Higest_Count_Of_dublicat_value {


public static void main(String[]args) {
	int[]arr= {1,2,3,4,1,3,5};
	int count=0;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
				count++;
			}
		}
	}
	System.out.println("How many time its repeated  "+count);
}
}