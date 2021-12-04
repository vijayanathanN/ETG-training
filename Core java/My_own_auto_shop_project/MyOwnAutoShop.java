package com.sonata;

public class MyOwnAutoShop {
	public static void main(String[]args) {
		Ford f=new Ford(108,13000,"Black");
		f.year=2020;
		f.manufacturediscount=20;
		f.display();
		
		Seden s=new Seden(120,12000,"Red");
		s.length=21;
		s.display();
		
		Truck t=new Truck(80,20000,"Red");
		t.weight=1560;
		t.display();
		
		
	}

}
