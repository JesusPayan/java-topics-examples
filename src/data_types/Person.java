package data_types;

import java.lang.reflect.Type;

public class Person {
    //default
    int id;
    String name;
    int age;
    double salary;
    String type;
    public Person(int id, String name, int age, double salary, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.type = type;
    }
}
