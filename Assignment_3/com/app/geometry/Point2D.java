package com.app.geometry;

import java.lang.Math;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D() {}
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String getDetails() {
		return "Point X - " + x + ", Point Y - " + y;
	}
	
	public boolean isEqual(Point2D p) {
		return (this.x == p.x && this.y == p.y);
	}
		
	public double calculateDistance(Point2D p) {
		double ans;
		ans = Math.sqrt(Math.pow((p.x - this.x),2) + Math.pow((p.y - this.y), 2));
		return ans;
	}
}


