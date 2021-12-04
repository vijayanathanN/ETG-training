package com.sonata;

public class Seden extends Car{
	
	int length;
	public Seden(int s,double p, String c) {
		super(s,p,c);
	}
	public double saleprice() {
		double price;
		if(length>20) {
			
			price=regularprice-(regularprice*0.05);
		}else {
			price=regularprice-(regularprice*0.1);
		}
		return price;
			
	}
	public void display() {
		System.out.println("____Seden Car____");
		System.out.println();
		System.out.println("length:"+length);
		System.out.println();
		System.out.println("Speed:"+speed);
		System.out.println();
		System.out.println("color:"+color);
		System.out.println();
		System.out.println("Baseprice:"+regularprice);
		System.out.println();
		System.out.println("Saleprice:"+saleprice());
		System.out.println();
		
	}
}
