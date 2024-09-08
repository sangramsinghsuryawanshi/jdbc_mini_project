package assignment69.com.API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class FilterObjectsByAge {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Alice", 25),
            new Person("Bob", 35),
            new Person("Charlie", 30),
            new Person("David", 40),
            new Person("Eve", 28)
        );

        List<Person> filteredPersons = persons.stream()
                                              .filter(person -> person.getAge() > 30) 
                                              .collect(Collectors.toList()); 

    
        System.out.println("Persons with age greater than 30: " + filteredPersons);
    }
}