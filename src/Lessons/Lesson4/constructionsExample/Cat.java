package Lessons.Lesson4.constructionsExample;

public class Cat {
    String name;
    String color;
    int age;

    public Cat() {

}

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat(int age, String name) {
        this.name = name;
        this.age = age;
        // Ja es konstruktoru taisu tadu pashu, tad jamaina vietam
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
