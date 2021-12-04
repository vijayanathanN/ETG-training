package com.sonata;

public class Car {
	
	int speed;
	double regularprice;
	String color;
	
	public Car(int s,double r,String c) {
		this.speed=s;
		this.regularprice=r;
		this.color=c;
		
	}
	
	public double saleprice() {
		
		double price=regularprice;
		return price;
	}

}
