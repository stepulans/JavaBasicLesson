package Lessons.lesson7.lessoncode.car;

public class CarDemo {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer("Mercedes", 2023);
        System.out.println("url to Manufacturer class - " + manufacturer);
        System.out.println("Value of 1. field Manufacturer Class - " + manufacturer.manufacturerFullName);
        System.out.println("Value of 2. field Manufacturer Class - " + manufacturer.year);

        CarColors color1 = new CarColors("Black Metallic");
        System.out.println("url to Color class - " + color1);
        System.out.println("Value of field Color Class - " + color1.color);


        Manufacturer manufacturer2 = new Manufacturer("BMW", 2022);
        System.out.println("url to Manufacturer class - " + manufacturer2);
        System.out.println("Value of 1. field Manufacturer Class - " + manufacturer2.manufacturerFullName);
        System.out.println("Value of 2. field Manufacturer Class - " + manufacturer2.year);


        Manufacturer manufacturer3 = new Manufacturer("Mercedes", 2023);
        System.out.println("Change link to example Class!!!");
        manufacturer3 = manufacturer2;
        System.out.println("url to Manufacturer class - " + manufacturer3);
        System.out.println("Value of 1. field Manufacturer Class - " + manufacturer3.manufacturerFullName);
        System.out.println("Value of 2. field Manufacturer Class - " + manufacturer3.year);

        Car newCar = new Car(manufacturer, "GL350D", "SUV",color1, 100);
        System.out.println();
        System.out.println();
        System.out.println("================================");

        System.out.println(newCar);
        System.out.println("New car manufacturer - " + newCar.manufacturer);
        System.out.println("New car model - " + newCar.model);
        System.out.println("New car type of body - " + newCar.typeOfBody);
        System.out.println("New car color - " + newCar.carColors);
        System.out.println("New car speed limit - " + newCar.getSpeedLimit());

        System.out.println("New car Manufacturer name - " + newCar.manufacturer.manufacturerFullName);
        System.out.println("New car Manufacturer year - " + newCar.manufacturer.year);
        System.out.println("New car Color - " + newCar.carColors.color);

        System.out.println("==================================");



        Car newCarBMW = new Car(manufacturer2, "740", "Limo", color1, 250);
        System.out.println(newCarBMW);
        System.out.println("New car manufacturer - " + newCarBMW.manufacturer);
        System.out.println("New car model - " + newCarBMW.model);
        System.out.println("New car type of body - " + newCarBMW.typeOfBody);
        System.out.println("New car color - " + newCarBMW.carColors);
        System.out.println("New car speed limit - " + newCarBMW.getSpeedLimit());

        System.out.println("New car Manufacturer name - " + newCarBMW.manufacturer.manufacturerFullName);
        System.out.println("New car Manufacturer year - " + newCarBMW.manufacturer.year);
        System.out.println("New car Color - " + newCarBMW.carColors.color);


    }

}
