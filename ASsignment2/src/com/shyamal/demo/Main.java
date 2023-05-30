package com.shyamal.demo;

class Parent {
    public Parent() {
        System.out.println("Parent constructor invoked");
    }
}

class Child extends Parent {
    public Child() {
       // super(); // Invoking parent class constructor
        System.out.println("Child constructor invoked");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child(); // Creating Child class object
    }
}

/*Constructors are special methods in a class that are used to initialize objects. They have the same name as the class and do not have a return type.

In Java, when you create an object of a child class, the constructor of the parent class is automatically invoked before the child class constructor. This is done to ensure that the parent class initializes its own members before the child class uses them.

The super() keyword is used to explicitly invoke the parent class constructor from the child class constructor. It must be the first statement inside the child class constructor. If you don't explicitly invoke super(), the compiler automatically inserts a call to the default constructor of the parent class.

In the provided example, the Child class extends the Parent class. When you create an object of the Child class, the Child constructor is called, which in turn calls the super() statement to invoke the constructor of the Parent class. This ensures that the parent class constructor is executed before the child class constructor.

The output of the program shows that the parent class constructor is invoked first, followed by the child class constructor.*/