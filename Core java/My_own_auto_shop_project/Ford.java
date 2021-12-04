package com.sonata;

public class Ford extends Car {
	
	int year;
	double manufacturediscount;
	
	public Ford(int s,double r,String c) {
		super(s,r,c);
	}
	
	public double saleprice() {
		
		double discount=regularprice*(manufacturediscount/100);
		double price=regularprice-discount;
		return price;
	
	}
	
	public void display() {
		System.out.println("____Ford Car____");
		System.out.println();
		System.out.println("Year:"+year);
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
