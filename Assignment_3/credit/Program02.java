package credit;

import java.util.Scanner;

class CreditLimit{
	
	private int accNum;
	private int begin_balance;
	private int charges;
	private int credits;
	private int credit_limit;
	private int newBal;
	
	public CreditLimit() {}

	public CreditLimit(int accNum, int begin_balance, int charges, int credits, int credit_limit) {
		super();
		this.accNum = accNum;
		this.begin_balance = begin_balance;
		this.charges = charges;
		this.credits = credits;
		this.credit_limit = credit_limit;
	}

	public int getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(int credit_limit) {
		this.credit_limit = credit_limit;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public int getBegin_balance() {
		return begin_balance;
	}

	public void setBegin_balance(int begin_balance) {
		this.begin_balance = begin_balance;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void newBalance() {
		newBal = begin_balance + charges - credits;
	}
	
	public void checkCredit() {
		System.out.println("Account Number : " + accNum);
		System.out.println("New Balance : " + newBal);
		if(newBal > credit_limit) {
			System.out.println("Credit limit exceeded");
		}
		else {
			System.out.println("Within credit limit");
		}
	}
}

class TestCredit{
	CreditLimit cl = new CreditLimit();
	
	public void accept(Scanner sc) {
		System.out.println("----------------Enter Details--------------------");
		System.out.print("Enter account number : ");
		int accNum = sc.nextInt();
		cl.setAccNum(accNum);
		System.out.print("Enter beginning balance : ");
		int begin_balance = sc.nextInt();
		cl.setBegin_balance(begin_balance);
		System.out.print("Enter charges this month : ");
		int charges = sc.nextInt();
		cl.setCharges(charges);
		System.out.print("Enter credits this month : ");
		int credits = sc.nextInt();
		cl.setCharges(credits);
		System.out.print("Enter credit limit : ");
		int credit_limit = sc.nextInt();
		cl.setCredit_limit(credit_limit);
		System.out.println("-------------------------------------------------");
	}
	
	public void display() {
		System.out.println("----------------Credit Status--------------------");
		cl.newBalance();
		cl.checkCredit();
		System.out.println("-------------------------------------------------");
	}
}

public class Program02 {
	
	public static int menuList(Scanner sc) {
		int choice;
		System.out.println("--------------------Choice----------------------");
		System.out.println("0. Exit");
		System.out.println("1. Check Credit Status");
		System.out.println("------------------------------------------------");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestCredit tc = new TestCredit();
		while(menuList(sc) != 0) {
			tc.accept(sc);
			tc.display();
		}
		sc.close();
		
	}
}