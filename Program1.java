class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {
    int roll;
    String name;
    Address address;

    Student() {
        roll = 0;
        name = "Unknown";
        address = new Address("Unknown");
    }

    Student(int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    // Shallow copy
    Student(Student s) {
        this.roll = s.roll;
        this.name = s.name;
        this.address = s.address;
    }

    // Deep copy
    Student deepCopy() {
        return new Student(this.roll, this.name,
                new Address(this.address.city));
    }

    void display() {
        System.out.println(roll + " " + name + " " + address.city);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Address a = new Address("Jalgaon");

        Student s1 = new Student(1, "Vivek", a);
        Student s2 = new Student(s1);       
        Student s3 = s1.deepCopy();        

        System.out.println("Before change:");
        s1.display();
        s2.display();
        s3.display();

        s1.address.city = "Pune";

        System.out.println("\nAfter changing original address:");
        System.out.println("Original:");
        s1.display();
        System.out.println("Shallow Copy:");
        s2.display();
        System.out.println("Deep Copy:");
        s3.display();
    }
}
