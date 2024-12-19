package isa;

public class Demo {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        Animal a1 = d1; // Why? because dog is an animal
        Animal a2 = c1; // Why? because cat is an animal

        Object o1 = d1; // Why? because dog is also an object
        Object o2 = c1; // Why? because cat is also an object
    }
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
