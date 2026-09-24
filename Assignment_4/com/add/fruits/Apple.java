package com.add.fruits;

public class Apple extends Fruit{

	private static final String name = "Apple";

	public Apple() {
		super();
	}

	public Apple(String color, double weight, boolean isFresh) {
		super(color, weight, isFresh);
	}

	public static String getName() {
		return name;
	}

	@Override
	public String taste() {
		return "Sweet and Sour";
	}
	
}
