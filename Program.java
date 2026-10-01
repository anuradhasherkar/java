package com.sunbeam;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Program {
public static Scanner sc = new Scanner(System.in);

public static List<RestaurantTable> tableList = new ArrayList<>();
public static List<Customer> customerList = new ArrayList<>();

  public static int menu() {

	System.out.println(" ");
	System.out.println("Restaurant System");
	System.out.println("");
	System.out.println("0. Exit");
	System.out.println("1.Add Table");
	System.out.println("2.Add Customer");
	System.out.println("3.Reserve Table");
	System.out.println("4.Cancel Reservation");
	System.out.println("5.Change Customer Table");
	System.out.println("6.Print All Tables");
	System.out.println("7.Show Available and Reserved Tables");
	System.out.println("8.Sort Tables");
			
	System.out.print("Enter choice: ");

	return sc.nextInt();
	}

	public static RestaurantTable findTable(int tableNumber) {

	for (RestaurantTable table : tableList) {

		if (table.getTableNumber() == tableNumber) {
		return table;
	
	}
		}

		return null;
	}

	public static Customer findCustomer(int customerId) {

	for (Customer customer : customerList) {

		if (customer.getCustomerId() == customerId) {
			return customer;
		}
	}

	return null;
	}


  public static void addTable() throws RestaurantException {

		System.out.print("Enter table number: ");
		int tableNumber = sc.nextInt();

				
		if (findTable(tableNumber) != null) {
		throw new RestaurantException("Duplicate table number is not allowed.");
	}

		System.out.print("Enter seating capacity: ");
		int capacity = sc.nextInt();

		if (capacity <= 0) {
		throw new RestaurantException("Seating capacity must be greater than 0.");
		}

		System.out.print("Enter price: ");
		double price = sc.nextDouble();

		if (price <= 0) {
		throw new RestaurantException("Price must be greater than 0.");
	}

		RestaurantTable table =new RestaurantTable(tableNumber, capacity, price);

		tableList.add(table);

		System.out.println("Table add successfully.");
	}

	public static void addCustomer() throws RestaurantException {

		System.out.print("Enter customer ID: ");
		int customerId = sc.nextInt();

		if (findCustomer(customerId) != null) {
		throw new RestaurantException("Duplicate customer ID is not allowed.");		}

		sc.nextLine();

		System.out.print("Enter customer name: ");
		String customerName = sc.nextLine();

		System.out.print("Enter contact number: ");
		String contactNumber = sc.nextLine();

		Customer customer =new Customer(customerId, customerName, contactNumber);

		customerList.add(customer);

		System.out.println("Customer add successfully.");
	}

	public static void reserveTable() throws RestaurantException {

		System.out.print("Enter customer ID: ");
		int customerId = sc.nextInt();

		Customer customer = findCustomer(customerId);
		if (customer == null) {
		throw new RestaurantException("Customer does not exist.");
	}

	for (RestaurantTable table :tableList) {

	  if (table.getCustomer() == customer) {
			throw new RestaurantException("Customer already has a table reserved.");
					}
				}

	System.out.print("Enter table number: ");
	int tableNumber = sc.nextInt();

	RestaurantTable table = findTable(tableNumber);

		
	   if (table == null) {
		throw new RestaurantException("Table does not exist.");
				}

				}


	public static void cancelReservation()
		throws RestaurantException {

	  System.out.print("Enter customer ID: ");
		int customerId = sc.nextInt();

		Customer customer = findCustomer(customerId);

				
		for (RestaurantTable table : tableList) {

		if (table.getCustomer() == customer) {

			table.setCustomer(null);

			System.out.println("Reservation cancelled successfully.");

						return;
					}
				}

			
	throw new RestaurantException("Customer does not have any table reserved.");
			}

			
	public static void changeCustomerTable()
	throws RestaurantException {

		System.out.print("Enter customer ID: ");
		int customerId = sc.nextInt();

		Customer customer = findCustomer(customerId);

			
		if (customer == null) {
		throw new RestaurantException("Customer does not exist.");
			}

		RestaurantTable currentTable = null;
			
		if (currentTable == null) {
		throw new RestaurantException("Customer does not have a reserved table.");
				}

		System.out.print("Enter new table number: ");
		int newTableNumber = sc.nextInt();

			RestaurantTable newTable = findTable(newTableNumber);
			currentTable.setCustomer(null);

			newTable.setCustomer(customer);

			System.out.println("Customer table changed successfully.");
			}

	
		public static void printAllTables() {

		if (tableList.isEmpty()) {
		System.out.println("No tables available.");
	      return;
				}

		for (RestaurantTable table : tableList) {
		System.out.println("");

	    System.out.println("Table Number: "+ table.getTableNumber());

		System.out.println("Seating Capacity: "+ table.getCapacity());

		System.out.println("Price: "+ table.getPrice());

			if (table.getCustomer() == null) {

		System.out.println("Reservation Available");

		System.out.println(	"Reserved Customer No");

			} else {

		System.out.println("Reservation- Reserved");

		System.out.println("Reserved Customer: "+ table.getCustomer());
					}
				}
			}

		
	public static void showAvailableReservedTables() {

	System.out.println("AVAILABLE TABLES");

	   boolean availableFound = false;

			for (RestaurantTable table : tableList) {

			if (table.getCustomer() == null) {

	System.out.println(table);

			availableFound = true;
					}
				}

			
			}

			
public static void sortTables() {

	tableList.sort(	Comparator.comparingInt(RestaurantTable::getTableNumber));

		System.out.println("Tables sorted by table number");

		for (RestaurantTable table : tableList) {

			System.out.println(table);

			if (table.getCustomer() != null) {

			System.out.println("Reserved Customer: "+ table.getCustomer());
		} else {

		System.out.println("Reservation: Available");
					}
				}
			}

	public static void main(String[] args) {

	int choice;

	do {

	choice = menu();

	try {

		switch (choice) {

		case 1:
		  addTable();
		   break;

		case 2:
			addCustomer();
			break;

		case 3:
        	reserveTable();
			break;

		case 4:
		  cancelReservation();
	    	break;

		case 5:
			changeCustomerTable();
			break;

			case 6:
		    	printAllTables();
				break;

			case 7:
				showAvailableReservedTables();
				break;

	
	       case 8:
	     	sortTables();
	      	break;

	   	case 0:
		System.out.println(" using Restaurant System.");
		break;

		default:
		System.out.println("Invalid choice.");
						}

		} catch (RestaurantException e) {

		System.out.println("Error: " + e.getMessage());
					}

		} while (choice != 0);

		sc.close();
	}
		
	}


