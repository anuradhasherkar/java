package com.add.fruits;

public class Mango extends Fruit{
	private static final String name = "Mango";

	public Mango() {
		super();
	}

	public Mango(String color, double weight, boolean isFresh) {
		super(color, weight, isFresh);
	}

	public static String getName() {
		return name;
	}

	@Override
	public String taste() {
		return "Sweet";
	}

}
