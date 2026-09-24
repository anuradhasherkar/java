package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

class TestPoint{
	Point2D p1 = new Point2D();
	Point2D p2 = new Point2D();
	
	public void accept(Scanner sc) {
		double x;
		double y;
		System.out.print("Enter X1 : ");
		x = sc.nextDouble();
		p1.setX(x);
		System.out.print("Enter Y1 : ");
		y = sc.nextDouble();
		p1.setY(y);
		System.out.print("Enter X2 : ");
		x = sc.nextDouble();
		p2.setX(x);
		System.out.print("Enter Y2 : ");
		y = sc.nextDouble();
		p2.setY(y);
	
	}
	
	public void display() {
		System.out.println("First cordinate : " + p1.getDetails());
		System.out.println("Second cordinate : " + p2.getDetails());
	}
	
	public void calDist() {
		if(p1.isEqual(p2)) {
			System.out.println("Both point located at same location.");
			System.out.println("Distance is 0");
		}
		else {
			System.out.println("Both point located at different location.");
			System.out.print("Distance is " + p1.calculateDistance(p2));
		}
	}
}

public class Program01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestPoint tp = new TestPoint();
		tp.accept(sc);
		tp.display();
		tp.calDist();
		sc.close();
	}
}
