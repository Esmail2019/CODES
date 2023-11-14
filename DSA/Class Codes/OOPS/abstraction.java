public class abstraction {

    public static void main(String args[]) {
        Horse h = new Horse();
        h.eats();
        h.walk();
        System.out.println(h.color);
        Chicken cn = new Chicken();
        cn.walk();
        cn.eats();

        Mustang myhorse = new Mustang();
        // Animal --- Horse => Mustang
    }

}

abstract class Animal {

    String color;

    Animal() {
        color = "brown";
        System.out.println("Animal constructor called");
    }

    void eats() {

        System.out.println("animal eats");
    }

    abstract void walk();

}

class Horse extends Animal {

    Horse() {
        System.out.println("Constructorr horse is called");
    }

    void changeColor() {
        color = "dark white";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang called");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "brown";
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}