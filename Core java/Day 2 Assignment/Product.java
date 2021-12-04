package com.sonata;

public class Product {
	
	int proid;
	String proname;
	static double proprice;
	
	Product(int id,String name,double price){
		this.proid=id;
		this.proname=name;
		this.proprice=price;
		
		
	}
	public double Totalbill(double GST) {
		double total=this.proprice*GST;
		return total;
	}
	
	public void display() {
		System.out.println("Productid: "+proid);
		System.out.println();
		System.out.println("Product name: "+proname);
		System.out.println();
		System.out.println("Base Price: "+proprice);
		System.out.println();
	}
	
	public static void main(String[]args) {
		Product p1=new Product(01,"MOBILE",1000);
		p1.display();
		double a=p1.Totalbill(0.02);
		System.out.println("TAX :"+a);
		System.out.println();
		double b=a+proprice;
		System.out.println("Total bill with tax: "+b);
		
	}

}



