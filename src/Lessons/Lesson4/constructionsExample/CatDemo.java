package Lessons.Lesson4.constructionsExample;

public class CatDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        myCat.name = "Barsik";
        myCat.color = "White";
        myCat.age = 2;

        System.out.println("My cat name - " + myCat.name + " color - " + myCat.color + " age - " + myCat.age);

        Cat myCat2 = new Cat("Theo","Black",4);
        System.out.println("My cat name - " + myCat2.name + " color - " + myCat2.color + " age - " + myCat2.age);

        Cat myCat3 = new Cat("Duda", "Grey",1);
        System.out.println("My cat name - " + myCat3.name + " color - " + myCat3.color + " age - " + myCat3.age);

         Cat myCat4 = new Cat("Buba","White",3);
        String message = "My cat name - " + myCat4.name + " color - " + myCat4.color + " age - " + myCat4.age;
        System.out.println(message);


    }
}
