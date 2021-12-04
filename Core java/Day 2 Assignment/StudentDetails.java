package com.sonata;

public class StudentDetails {
	int stdid;
	
	String stdname;
	
	char stdclass;
	
	StudentDetails(int id,String name,char cls){
		
		this.stdid=id;
		
		this.stdname=name;
		
		this.stdclass=cls;
		
	}
	
	public void display() {
		
		System.out.println("Student id:  "+stdid);
		
		System.out.println("Student Name:  "+stdname);
		
		System.out.println("Student Class:  "+stdclass);
		
	}
	
	public static void main(String[]args) {
		StudentDetails s1=new StudentDetails(1,"Vijay",'A');
		StudentDetails s2=new StudentDetails(2,"Sandy",'B');
		s1.display();
		s2.display();
		
	}
	
}
