package spring_introduction;

public class Runner {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();

        Pet pet1 = new Cat();
        pet1.say();
    }
}
