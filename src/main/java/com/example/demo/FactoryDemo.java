package com.example.demo;

public class FactoryDemo {
    public static void main(String[] args) {
        Person defaultPerson = PersonFactory.createDefaultPerson();
        System.out.println("Name: " + defaultPerson.getName() + ", Age: " + defaultPerson.getAge());
    }
}
