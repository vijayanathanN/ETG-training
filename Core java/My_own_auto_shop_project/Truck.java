package com.sonata;

public class Truck extends Car{
	
	int weight;
	public Truck(int s,double p,String c) {
		super(s,p,c);
		
	}
	
	public double saleprice() {
		double price;
		if(weight>2000) {
			price=regularprice-(regularprice*0.1);
		}else {
			price=regularprice-(regularprice*0.2);
		}
		return price;
	}
	
	public void display() {
		System.out.println("_____Truck____");
		System.out.println();
		System.out.println("Weight:"+weight);
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
