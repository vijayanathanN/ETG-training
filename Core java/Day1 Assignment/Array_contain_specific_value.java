package com.sonata;

public class Array_contain_specific_value {
	public static void main(String[]args) {
		int i[]= {1,2,3,4,5,6,7,8,9};
		int tofind=7;
		for(int n=0;n<i.length;n++) {
			if (i[n]==tofind) {
				System.out.println("The num is founded"+tofind);}
				else {
					System.out.println("The num is Nort founded");
				}
			}
		}
	}

