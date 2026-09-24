package com.util;

import java.util.List;
import java.util.ListIterator;
import com.domain.Library;
import java.util.Scanner;

public class Functions {
	
	public static String acceptIsbn(Scanner sc) {

		System.out.print("Enter ISBN : ");
		return sc.next();
	}

	public static void addBook(List<Library> list, Scanner sc) {
		
		Library lib = new Library();
		System.out.print("ISBN : ");
		lib.setIsbn(sc.next());
		System.out.print("Author Name : ");
		lib.setAuthorName(sc.next());
		System.out.print("Price : ");
		lib.setPrice(sc.nextDouble());
		System.out.print("Quantity : ");
		lib.setQuantity(sc.nextInt());
		list.add(lib);
		System.out.println("Book with " + lib.getIsbn() + " ISBN added successfully");
	}
	
	public static void displayForward(List<Library> list) {
		
		ListIterator<Library> itr = list.listIterator();
		while(itr.hasNext()) {
			Library lib = itr.next();
			System.out.println(lib.toString());
		}
	}
	
	public static void displayReverse(List<Library> list) {
		
		ListIterator<Library> itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			Library lib = itr.previous();
			System.out.println(lib.toString());
		}
		
	}
	
	public static void deleteBook(List<Library> list, String isbn) {
		
		Library lib = new Library();
		lib.setIsbn(isbn);
		int idx = list.indexOf(lib);
		
		if(idx != -1) {
			list.remove(idx);
			System.out.println("Book deleted successfully");
		}
		else {
			System.out.println("Book not found");
		}
		
	}
		
}
