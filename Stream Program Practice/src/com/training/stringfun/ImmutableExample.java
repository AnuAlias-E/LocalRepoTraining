package com.training.stringfun;



public class ImmutableExample {
    public static void main(String[] args) {
        // Create an immutable Person object
        Person person = new Person("John", 30);

        // Trying to modify the fields directly will result in a compile-time error
        // person.name = "Jane";  // Error: Cannot assign a value to final variable 'name'
        // person.age = 35;       // Error: Cannot assign a value to final variable 'age'

        // You can still access the values via the getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Even though the fields are immutable, you can still create a new object with a different state
        // without modifying the original one
        Person newPerson = new Person("Jane", 35);
        System.out.println("New Person Name: " + newPerson.getName());
        System.out.println("New Person Age: " + newPerson.getAge());
    }
}
 final class Person {
    private final String name;
    private final int age;
    
    // Constructor to initialize the immutable fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // No setter methods, making it immutable.
}