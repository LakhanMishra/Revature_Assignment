package com.revature.assignment2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion(),
                new Tiger(),
                new Cat(),
                new Dog(),
                new Wolf(),
                new Hippo()
        };

        for (Animal a : animals) {
            System.out.println("\nClass: " + a.getClass().getSimpleName());
            a.makeNoise();
            a.eat();
            a.sleep();
            a.roam();
        }
    }
}
