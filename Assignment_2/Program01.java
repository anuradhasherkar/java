import java.util.Scanner;

class Invoice {
	private String part_no;
	private String part_desc;
	private int qty;
	private double price;
	
	public Invoice() {}
	
	public Invoice(String part_no, String part_desc, int qty, double price) {
		this.part_no = part_no;
		this.part_desc = part_desc;
		this.qty = qty;
		this.price = price;
	}
	
	public String getPart_no() {
		return part_no;
	}

	public void setPart_no(String part_no) {
		this.part_no = part_no;
	}

	public String getPart_desc() {
		return part_desc;
	}

	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if(qty<0) qty = 0;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0.0) price = 0.0;
		this.price = price;
	}
	
}

class InvoiceTest{
	Invoice inv = new Invoice();
	
	public void acceptRecord() {
		
		String part_no;
		String part_desc;
		int qty;
		double price;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter part number : ");
		part_no = sc.next();
		inv.setPart_no(part_no);
		System.out.print("Enter part description : ");
		sc.nextLine();
		part_desc = sc.nextLine();
		inv.setPart_desc(part_desc);
		System.out.print("Enter the quantity : ");
		qty = sc.nextInt();
		if(qty<0) qty = 0;
		inv.setQty(qty);
		System.out.print("Enter the price : ");
		price = sc.nextDouble();
		if(price<0.0) price = 0.0;
		inv.setPrice(price);
		sc.close();
	}
	
	public void printRecord() {
		
		System.out.println("Part Number : " + inv.getPart_no());
		System.out.println("Part Description : " + inv.getPart_desc());
		System.out.println("Quantity : " + inv.getQty());
		System.out.println("Price : " + inv.getPrice());
		System.out.println("Total Amount : " + inv.getQty() * inv.getPrice());
	}
}

public class Program01{
	
	public static void main(String[] args) {
		
		InvoiceTest it = new InvoiceTest();
		it.acceptRecord();
		it.printRecord();
		
	}
}