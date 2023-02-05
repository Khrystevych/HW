package HW5;

public class Animal {
    int eyes;
    String phrase;

    public Animal(String phrase) {
        this.phrase = phrase;
    }

    void eat() {
        System.out.println("HW5.Animal eats");
    }

    void drink() {
        System.out.println("HW5.Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    Pet(String phrase, int eyes) {
        super("I am animal");
        this.phrase = phrase;
        this.eyes = eyes;
    }

    void run() {
        System.out.println("HW5.Pet runs");
    }

    void jump() {
        System.out.println("HW5.Pet jumps");
    }
}

class Dog extends Pet {

    Dog(String phrase, String name) {
        super("I am pet", 2);
        this.phrase = phrase;
        this.name = name;
    }

    void play() {
        System.out.println("HW5.Dog plays");
    }
}

class Cat extends Pet {
    Cat(String phrase, String name) {
        super("I am pet", 2);
        this.phrase = phrase;
        this.name = name;
    }

    void sleep() {
        System.out.println("HW5.Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("I am animal");
        System.out.println(animal);
        Pet pet = new Pet("I am pet", 2);
        System.out.println(pet);
        Dog dog = new Dog("I am dog and my name is:", "Rex");
        System.out.println(dog);
        System.out.println(dog.paw);
        Cat cat = new Cat("I am cat and my name is:", "Oscar");
        System.out.println(cat);
        cat.sleep();
    }
}
