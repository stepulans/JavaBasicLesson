package Lessons.lesson7.lessoncode;
/*
    Тема: создание класса Dog.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- У собаки должна быть кличка.
- Кличку собаке дают в момент создания и потом ее изменить нельзя.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки три раза.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).

-=-=---------
Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Должна быть возможность указывать возраст собаки.
- Возраст указывается в годах (целым числом).
- Возраст собаке дают в момент создания.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки и ее возраст.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
     */
public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void voice(){
        System.out.println("Dog name - " + name + "; age " + age + "; color " + color);

    }
    void changeColor(String newColor) {
        // напишите тут команду сохранения нового цвета в свойство класса
        color = newColor;
    }

}
