package com.bhagyavanth.assignment;

public class MainClass {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10.00,20.00);
		Rectangle r2 = new Rectangle(20.00,50.00);
		Rectangle r3 = new Rectangle(30.00,10.00);
		Rectangle r4 = new Rectangle(40.00,20.00);
		Rectangle r5 = new Rectangle(50.00,10.00);
	
		System.out.println("length is" + " " + r1.getLength());
		System.out.println("breadth is" + " " + r1.getBreadth());
		r1.Area();
		
	    System.out.println("length is" + " " + r2.getLength());
	    System.out.println("breadth is" + " " + r2.getBreadth());
	    r2.Area();
	    
	    System.out.println("length is" + " " + r3.getLength());
	    System.out.println("breadth is" + " " + r3.getBreadth());
	    r3.Area();
	    
	    System.out.println("length is" + " " + r4.getLength());
	    System.out.println("breadth is" + " " + r4.getBreadth());
	    r4.Area();
	    
	    System.out.println("length is" + " " + r5.getLength());
	    System.out.println("breadth is" + " " + r5.getBreadth());
	    r5.Area();
	}

}

