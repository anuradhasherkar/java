package com.util;
import java.util.Scanner;

public class Menu {

	public static int menuList(Scanner sc) {
		
		System.out.println("0. Exit");
		System.out.println("1. Add book");
		System.out.println("2. Display books in forward order");
		System.out.println("3. Display books in reverse order");
		System.out.println("4. Delete book");
		System.out.println("5. Sort book");
		System.out.print("Enter your choice : ");
		return sc.nextInt();
	}
	
}
