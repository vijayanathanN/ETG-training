package com.sonata;

public class Replace_StringVowels {
	public static void main(String[]args) {
		
		String name="Vijayanathan";
		
		
		System.out.println("the given name is "+name);
		
		name=name.replaceAll("[aeiou]", "$");
		
		System.out.println(name);
		
	}
}
