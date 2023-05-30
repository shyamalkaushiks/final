package com.shyamal.demo;


import java.util.stream.Collectors;
import java.util.*;



class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}


public class Main {
    public static void main(String[] args) {
        // Create a large data set of Person objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 30));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 35));
        persons.add(new Person("Emily", 27));
        persons.add(new Person("David", 40)); 
        persons.add(new Person("John", 30));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 35));
        persons.add(new Person("Emily", 27));
        persons.add(new Person("David", 40));
        List<Person> s=persons.stream().filter(per2->per2.getAge()>=30).collect(Collectors.toList());
        s.forEach(System.out::print);
      
         persons.stream().sorted((p1,p2)->
         p1.getName().compareTo(p2.getName())
        		 ).collect(Collectors.toList());
}
}