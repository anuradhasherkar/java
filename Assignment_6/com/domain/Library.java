package com.domain;

public class Library implements Comparable<Library>{
	
	private String isbn;
	private String authorName;
	private double price;
	private int quantity;
	
	public Library() { }

	public Library(String isbn, String authorName, double price, int quantity) {
		this.isbn = isbn;
		this.authorName = authorName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Library other) {
		return Double.compare(other.price, this.price);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) return false;
		if(obj == this) return true;
		if(!(obj instanceof Library)) return false;
		
		Library other = (Library)obj;
		return this.getIsbn().contentEquals(other.getIsbn());
	}
	
	@Override
	public String toString() {
		return String.format("ISBN : %s , Author Name : %s , Price : %.2f , Quantity : %d", isbn, authorName, price, quantity);
	}
}
