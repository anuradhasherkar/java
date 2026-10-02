import java.util.Arrays;
import java.util.Comparator;

class Student13 {
    private int roll;
    private String name;
    private String city;
    private double marks;

    Student13(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getMarks() {
        return marks;
    }

    public String toString() {
        return roll + " " + name + " " + city + " " + marks;
    }
}

public class Program12 {
    public static void main(String[] args) {
        Student13[] students = {
            new Student13(1, "Vivek", "Jalgaon", 85),
            new Student13(2, "Rahul", "Pune", 90),
            new Student13(3, "Amit", "Pune", 95),
            new Student13(4, "Akash", "Jalgaon", 90),
            new Student13(5, "Rohit", "Pune", 90),
            new Student13(6, "Kunal", "Mumbai", 88)
        };

        Arrays.sort(students,
            Comparator.comparing(Student13::getCity, Comparator.reverseOrder())
                .thenComparing(Student13::getMarks, Comparator.reverseOrder())
                .thenComparing(Student13::getName)
        );

        System.out.println("Students after sorting:");

        for (Student13 s : students)
            System.out.println(s);
    }
}
