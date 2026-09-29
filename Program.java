import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class sortByRollno implements Comparator<Student>{
	public int compare(Student x,Student y) {
		return x.getRollno()-y.getRollno();
		
	}
}
class sortByname implements Comparator<Student>{
	public int compare(Student x,Student y) {
		return x.getName().compareTo(y.getName());		
	}
}class sortBymarks implements Comparator<Student>{
	public int compare(Student x,Student y) {
		return Double.compare(x.getMarks(), y.getMarks());
		
	}
}
public class Program {
public static Scanner sc=new Scanner(System.in);
public static List<Student>list=new ArrayList<>();
public static void  acceptData() {
	for(int i=0;i<5;i++) {
		System.out.println("Enter the Name");
		String Name=sc.next();
		
		System.out.println("Enter the Roll");
		 int Roll=sc.nextInt();
		 
		 System.out.println("Enter the marks");
		double marks=sc.nextDouble();
		
		Student s=new Student (Name,Roll,marks);
		list.add(s);
	}}
	
	//display
	public static  void displayData() {
		Iterator<Student>itr=list.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			System.out.println(s);
		}
	
	}
	
	public static  void access(int[] roll) {
		System.out.println("Enter the RollNo:");
		roll[0]=sc.nextInt();
	}
	
	//find
	public static void findStud(int rol) {
		for(Student s:list) {
			if(rol==s.getRollno()) {
				System.out.println(s);
				System.out.println("removed");
			}
		}
	}
	
	
public static int menu() {
	System.out.println("0.Exit");
	System.out.println("1.Add Student");
	System.out.println("2.Display");
	System.out.println("3.Search By RollNo ");
	System.out.println("4.Sort by RollNo");
	System.out.println("5.Sort by name");
	System.out.println("6.Sort By Marks");
	System.out.println("Enter the Choice:");
	return sc.nextInt();

}
public static void  printEmp() {
	for(Student s:list) {
		System.out.println(s.toString());
	}
}
public static void main(String[]args) {
	int choice;
	Comparator<Student>comparator=null;
	int[]roll=new int[1];
	while((choice=menu())!=0) {
		switch(choice) {
		case 1:
			acceptData();
			break;
		case 2:	
			displayData();
			break;
		case 3:
			access(roll);
			findStud(roll[0]);
			break;
		case 4:
			comparator=new sortByRollno();
			list.sort(comparator);
			printEmp();
			break;
		case 5:
			comparator=new sortByname();
			list.sort(comparator);
			printEmp();
			break;
		case 6:
			comparator=new sortBymarks();
			list.sort(comparator);
			printEmp();	
			break;
			
		}
	
	}
}
}

