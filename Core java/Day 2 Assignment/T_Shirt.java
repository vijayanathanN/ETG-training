package com.sonata;

public class T_Shirt {
	String color;
	String material;
	String design;
	String Size;
	
	public T_Shirt(String cl,String mt,String de,String si) {
		
	
	this.color=cl;
	this.material=mt;
	this.design=de;
	this.Size=si;
	
	}
	
	public void small() {
		
		System.out.println("This is Small size");
		
	}
	
	public void Medium() {
		System.out.println("This is  medium size");
		
	}
	public void Large() {
		System.out.println("This is Large size");
	}
	
	public void display() {
		System.out.println("Color: "+color);
		System.out.println();
		System.out.println("Material: "+material);
		System.out.println();
		System.out.println("Design: "+design);
		System.out.println();
		System.out.println("Size: "+Size);
		System.out.println();
		
	}
	
	public static void main(String[]args) {
		T_Shirt t1=new T_Shirt("red","cotton","Fullsleave","S");
		System.out.println();
		t1.display();
		t1.small();
		T_Shirt t2=new T_Shirt("Black","cotton","sleaveless","M");
		System.out.println();
		t2.display();
		t2.Medium();
		T_Shirt t3=new T_Shirt("White","cotton","Fullsleave","X");
		System.out.println();
		t3.display();
		t3.Large();
	}
}
