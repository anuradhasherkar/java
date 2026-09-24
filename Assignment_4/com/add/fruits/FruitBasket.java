package com.add.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	public static int menuList(Scanner sc){
		int choice;
		System.out.println("----------MENU LIST----------");
		System.out.println("0. Exit");
		System.out.println("1. Add Apple");
		System.out.println("2. Add Mango");
		System.out.println("3. Add Orange");
		System.out.println("4. Display names of all fruits in the basket");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits, in the basket.");
		System.out.println("6. Display tastes of all stale fruits in the basket.");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");
		System.out.println("-----------------------------");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void accept(Fruit fr, Scanner sc) {
		System.out.print("Enter color of fruit : ");
		fr.setColor(sc.next());
		System.out.print("Enter weight of fruit : ");
		fr.setWeight(sc.nextDouble());
		fr.setFresh(true);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basket size : ");
		int basket_size = sc.nextInt();
		Fruit[] fr = new Fruit[basket_size];
		int total_fruit = 0;
		int choice;
		while((choice = FruitBasket.menuList(sc)) != 0) {
			switch(choice) {
			case 1:
				if(total_fruit < basket_size) {
					fr[total_fruit] = new Apple();
					FruitBasket.accept(fr[total_fruit], sc);
					total_fruit++;
				}
				break;
			case 2:
				if(total_fruit < basket_size) {
					fr[total_fruit] = new Mango();
					FruitBasket.accept(fr[total_fruit], sc);
					total_fruit++;
				}
				break;
			case 3:
				if(total_fruit < basket_size) {
					fr[total_fruit] = new Orange();
					FruitBasket.accept(fr[total_fruit], sc);
					total_fruit++;
				}
				break;
			case 4:
				for(Fruit f: fr) {
					if(f == null) System.out.println("No fruit found");;
					if(f instanceof Apple) System.out.println(Apple.getName());
					if(f instanceof Mango) System.out.println(Mango.getName());
					if(f instanceof Orange)System.out.println(Orange.getName());
				}
				break;
			case 5:
				for(Fruit f: fr) {
					if(f != null) {
						if(f.isFresh()) {
							System.out.println(f.toString());
						}
					}
				}
				break;
			case 6:
				for(Fruit f : fr) {
					if(f != null) {
						if(!(f.isFresh())){
							System.out.println(f.taste());
						}
					}
				}
				break;
			case 7:
				System.out.print("Enter index of fruit which you want to mark stale : ");
				int index = sc.nextInt();
				if(index < basket_size) {
					if(fr[index] == null) {
						System.out.println("Invalid Index");
					}
					else {
						fr[index].setFresh(false);
					}
				}
				break;
			case 8:
				for(Fruit f : fr) {
					if(f != null) {
						if(f.taste() == "Sour") {
							f.setFresh(false);
						}
					}
				}
				break;
			default:
				break;
			}
		}
		sc.close();
	}
}