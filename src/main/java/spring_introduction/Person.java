package spring_introduction;

import lombok.Getter;

public class Person {
    private Pet pet;

    @Getter
    private String name;
    @Getter
    private int age;

    public void setName(String name) {
        System.out.println("Class Person: set name");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(){
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
