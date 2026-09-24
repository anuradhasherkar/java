import java.util.Scanner;

class Resturant{
	private int total_amount = 0;
		
	public static int menu() {
		System.out.println("--------------Items--------------");
		System.out.println("1. Dosa");
		System.out.println("2. Idli");
		System.out.println("3. Samosa");
		System.out.println("4. Medu Vada");
		System.out.println("5. Kachodi");
		System.out.println("6. Biryani");
		System.out.println("---------------------------------");
		System.out.println("0. Order done");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}
	
	public void giveOrder() {
		int choice;
		while((choice = Resturant.menu()) != 0) {
			switch(choice) {
			case 1:
				this.total_amount += 100;
				break;
			case 2:
				this.total_amount += 40;
				break;
			case 3:
				this.total_amount += 20;
				break;
			case 4:
				this.total_amount += 30;
				break;
			case 5:
				this.total_amount += 65;
				break;
			case 6:
				this.total_amount += 150;
				break;
			}
		}
	}
	
	public void getBill() {
		System.out.println("Total Bill : " + this.total_amount);
	}
}


public class Program_3 {

	public static void main(String[] args) {
		
		Resturant r1 = new Resturant();
		r1.giveOrder();
		r1.getBill();

	}

}