import java.util.Scanner;

class Employee{
	private String f_name;
	private String l_name;
	private double sal;
	
	public Employee() {}

	public Employee(String f_name, String l_name, double sal) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.sal = sal;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
		
}

class EmployeeTest{
	Employee e1 = new Employee();
	
	public void acceptRecord() {
		String f_name;
		String l_name;
		double sal;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name : ");
		f_name = sc.next();
		e1.setF_name(f_name);
		System.out.print("Enter last name : ");
		l_name = sc.next();
		e1.setL_name(l_name);
		System.out.print("Enter salary : ");
		sal = sc.nextDouble();
		e1.setSal(sal);
		sc.close();
	}
	
	public void incrSalary() {
		double sal;
		sal = e1.getSal() * 1.10;
		e1.setSal(sal);
	}
	
	public void printRecord() {
		System.out.println("--------------------------------------------");
		System.out.println("First Name : " + e1.getF_name());
		System.out.println("Last Name : " + e1.getL_name());
		System.out.println("Salary : " + e1.getSal());
		System.out.println("--------------------------------------------");
	}
}

public class Program02 {

	public static void main(String[] args) {
		
		EmployeeTest et1 = new EmployeeTest();
		EmployeeTest et2 = new EmployeeTest();
		
		et1.acceptRecord();
		et1.printRecord();
		et1.incrSalary();
		et1.printRecord();
		
		et2.acceptRecord();
		et2.printRecord();
		et2.incrSalary();
		et2.printRecord();
		
	}

}



