package com.sunbeam;
import java.util.Scanner;

class NegativeException extends Exception{
	public NegativeException(String message) {
		super(message);
	}
}

class Circle{
	private double myX;
	private double myY;
	private double mydiameter;
	
	public Circle() {
		this.myX=0;
		this.myY=0;
		this.mydiameter=100;
	}

	public double getMyX() {
		return myX;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	public double getMyY() {
		return myY;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}

	public double getDiameter() {
		return mydiameter;
	}

	public void setDiameter(double diameter) throws NegativeException{
		if(diameter <0) {
			throw new NegativeException("diameter is negative");
		}
		
		this.mydiameter = mydiameter;
	}
	
	public void display() {
		System.out.println("Center x:" +myX);
		System.out.println("Center y:" +myY);
		System.out.println("Diameter:" +mydiameter);
	}
	
}


public class Assignment07_2 {

	public static void main(String[] args) {
		Scanner sc=new  Scanner (System.in);
		Circle c=new Circle();
		
		System.out.println("Enter X cordinate:");
		double x=sc.nextDouble();
		
		System.out.println("Enter Y cordinate:");
		double y=sc.nextDouble();
		
		System.out.println("Enter Diameter:");
		double diameter=sc.nextDouble();
		
		c.setMyX(x);
		c.setMyY(y);
		
		try {
			c.setDiameter(diameter);
			System.out.println("Circle Details");
			c.display();
		}
		catch(NegativeException e) {
			System.out.println(e.getMessage());
			
		}
		
		

	}

}
