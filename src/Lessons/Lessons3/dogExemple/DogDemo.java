package Lessons.Lessons3.dogExemple;

public class DogDemo {
    public static void main(String[] args) {

    Dog dog1 = new Dog();
    dog1.name = "Zeus";
    dog1.age = 2;


    System.out.println(dog1.name);

        dog1.voice();

        String message = "My name - " + dog1.name;


        dog1.say(message);


        Dog dog2 = new Dog();
        dog2.name = "Markus";
        dog2.age = 4;
        dog2.voice();


    }
}
