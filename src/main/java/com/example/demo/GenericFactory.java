package com.example.demo;

public class GenericFactory<T> {

    private final Class<T> type;

    public GenericFactory(Class<T> type) {
        this.type = type;
    }

    public T createInstance() {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of: " + type.getName(), e);
        }
    }

    public static void main(String[] args) {
        GenericFactory<Person> personFactory = new GenericFactory<>(Person.class);
        Person person = personFactory.createInstance();
        person.setName("Alice");
        person.setAge(28);

        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());


        GenericFactory<String> stringFactory = new GenericFactory<>(String.class);
        String str = stringFactory.createInstance();

        System.out.println("Created an empty String instance: " + str);
    }
}
