package com.epam;

import com.epam.OOP.Bird;
import com.epam.OOP.Dog;

public class MainClass {
    public static void main(String[] args) {

        //task 1 test
        Dog dog = new Dog();
        Bird bird = new Bird();
        //Used super() method on the constructor of Dog class which gives fields to parent class Animal
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}
