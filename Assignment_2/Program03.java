import java.util.Scanner;

class Date{
	
	private int day;
	private int month;
	private int year;
	
	public Date() {}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}

class DateTest{
	
	Date d = new Date();
	
	public void acceptRecord() {
		
		int day;
		int month;
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter day : ");
		day = sc.nextInt();
		d.setDay(day);
		System.out.print("Enter month : ");
		month = sc.nextInt();
		d.setMonth(month);
		System.out.print("Enter year : ");
		year = sc.nextInt();
		d.setYear(year);
	}
	
	public void printRecord() {
		
		System.out.println("Date : " + d.getDay() + "/" + d.getMonth() + "/" + d.getYear());
	}
	
}

public class Program03 {
	public static void main(String[] args) {
		DateTest dt = new DateTest();
		dt.acceptRecord();
		dt.printRecord();
	}
}
