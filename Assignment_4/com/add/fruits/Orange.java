package com.add.fruits;

public class Orange extends Fruit{

	private static final String name = "Orange";

	public Orange() {
		super();
	}

	public Orange(String color, double weight, boolean isFresh) {
		super(color, weight, isFresh);
	}

	public static String getName() {
		return name;
	}

	@Override
	public String taste() {
		return "Sour";
	}
	
}
