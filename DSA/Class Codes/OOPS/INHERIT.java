public class INHERIT {
    public static void main(String args[]) {
        Fish tuna = new Fish();
        tuna.breathe();

        Dog dobby = new Dog();
        dobby.breathe();
        dobby.legs = 4;
        System.out.println(dobby.legs);

        Human man = new Human();
        man.breathe();

        Birds peacock = new Birds();
        peacock.fly();

    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;

    void walks() {

    }

}

class Dog extends Mammal {
    String breed;

    void barks() {
        System.out.println("Dogs bark");
    }

}

class Cats extends Mammal {
    String breed;

    void mew() {
        System.out.println("Cats mews");
    }

}

class Human extends Mammal {
    String breed;

    void talks() {
        System.out.println("Human talks");
    }

}

class Birds extends Mammal {
    void fly() {
        System.out.println("Flys");
    }

}

class Fish extends Animal {
    int fins;

    void swims() {
        System.out.println("Swims in water");
    }
}