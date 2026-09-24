package com.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.domain.Library;
import com.util.Functions;
import com.util.Menu;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Library> list = new ArrayList<>();
		
		int choice;
		
		while((choice = Menu.menuList(sc)) != 0) {
			
			switch(choice) {
			case 1:
				Functions.addBook(list, sc);
				break;
			case 2:
				Functions.displayForward(list);
				break;
			case 3:
				Functions.displayReverse(list);
				break;
			case 4:
				String isbn = Functions.acceptIsbn(sc);
				Functions.deleteBook(list, isbn);
				break;
			case 5:
				Collections.sort(list);
				Functions.displayForward(list);
				break;
			}
			
		}

	}

}
