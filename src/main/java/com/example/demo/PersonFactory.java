package com.example.demo;

public class PersonFactory {
    public static Person createDefaultPerson() {
        Person person = new Person();
        person.setName("Default Name");
        person.setAge(30);
        return person;
    }
}
