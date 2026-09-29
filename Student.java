import java.util.Objects;

public class Student {
private String name;
private int rollno;
private double marks;
Student(){}
public Student(String name, int rollno, double marks) {
	this.name = name;
	this.rollno = rollno;
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
}
@Override
public int hashCode() {
	return Objects.hash(marks, name, rollno);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks) && Objects.equals(name, other.name)
			&& rollno == other.rollno;
}



}
