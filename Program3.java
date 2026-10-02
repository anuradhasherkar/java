class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

// IS-A relationship
class Lion extends Animal {
    Lion(String name) {
        super(name);
    }

    void roar() {
        System.out.println(name + " is roaring");
    }
}

class Elephant extends Animal {
    Elephant(String name) {
        super(name);
    }

    void trumpet() {
        System.out.println(name + " is trumpeting");
    }
}

// HAS-A relationship
class Zoo {
    String zooName;
    Animal animal;

    Zoo(String zooName, Animal animal) {
        this.zooName = zooName;
        this.animal = animal;
    }

    void display() {
        System.out.println("Zoo Name: " + zooName);
        System.out.println("Animal: " + animal.name);
        animal.eat();
    }
}

public class Program3 {
    public static void main(String[] args) {
        Lion lion = new Lion("Sheru");

        // Lion IS-A Animal
        lion.eat();
        lion.roar();

        // Zoo HAS-A Animal
        Zoo zoo = new Zoo("Jalgaon Zoo", lion);
        System.out.println();
        zoo.display();
    }
}
