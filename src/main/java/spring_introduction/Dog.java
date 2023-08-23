package spring_introduction;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean si created");
    }

    @Override
    public void say(){
        System.out.println("Bark");
    }
}
