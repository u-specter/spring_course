package spring_introduction;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("personBean")
public class Person {

    private Pet pet;

    @Getter
//    @Value("${person.name}")
    private String name;
    @Getter
//    @Value("${person.age}")
    private int age;

    public void setName(String name) {
        System.out.println("Class Person: set name");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }


    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    public Person(){
//        System.out.println("Person bean is created");
//    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
