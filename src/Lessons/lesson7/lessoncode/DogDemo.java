package Lessons.lesson7.lessoncode;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik", 5,"grey");
        dog1.voice();
        dog1.changeColor("white");
        dog1.voice();
        System.out.println(dog1.getColor());
        dog1.setColor("red");
        System.out.println(dog1.getColor());
        dog1.voice();


    }
}
