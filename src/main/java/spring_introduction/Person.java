package spring_introduction;

public class Person {
    private Pet pet;
    private String age;

    public Person(Pet pet, String age) {
        this.pet = pet;
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
