package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.makeSound();

        Animal animal2 = new Cat();
        animal2.makeSound();
    }
}
