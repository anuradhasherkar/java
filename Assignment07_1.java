package com.sunbeam;
import java.util.Scanner;

class ExceptionLineTooLong extends Exception{
	public ExceptionLineTooLong(String message) {
        super(message);
}
}
class Programm {
	private String message;
	public Programm() { } 
	public Programm(String message) {
		this.message=message;
	}
	public void acceptStr() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		this.message=sc.nextLine();
	}
	public void printStr() {
		System.out.println("String Is:" + message);
	}
	public void checkLength() throws ExceptionLineTooLong{
		int length=message.length();
		System.out.println("String length is:" +length);
		
		if(length>80) {
			throw new ExceptionLineTooLong("String length is greater");
		}
		
	}
}
	public class Assignment07_1{
		public static void main(String[] args) {
			Programm p=new Programm();
			p.acceptStr();
			
			try {
				p.checkLength();
				p.printStr();
				
			}
			catch(ExceptionLineTooLong e){
				System.out.println(e.getMessage());
				
			}
		}
	}

	
