package com.sonata;

public class Two_lagest_element_in_Array {
	public static void main(String[]args) {
		int a[]= {1,2,3,4,6,8,9};
		int largest=7;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=largest) {
				System.out.println(a[i]);
			}
		}
	}

}
