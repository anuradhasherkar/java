package com.add.fruits;

public abstract class Fruit {

	private String color;
	private double weight;
	private boolean isFresh;
	
	public Fruit() {}

	public Fruit(String color, double weight, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public abstract String taste();

	@Override
	public String toString() {
		if(this instanceof Apple) {
			return String.format("Name : %s\nColor: %s\nWeight : %f\nTaste : %s\n", Apple.getName(), this.getColor(), this.getWeight(), this.taste());
		}
		if(this instanceof Mango) {
			return String.format("Name : %s\nColor: %s\nWeight : %f\nTaste : %s\n", Mango.getName(), this.getColor(), this.getWeight(), this.taste());
		}
		if(this instanceof Orange) {
			return String.format("Name : %s\nColor: %s\nWeight : %f\nTaste : %s\n", Orange.getName(), this.getColor(), this.getWeight(), this.taste());
		}
		return null;
	}
	
}
