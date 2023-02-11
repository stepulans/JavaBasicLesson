package Homework.secondHomework.Device;

import java.util.Scanner;

public class Device {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first temperature : ");
        double Temperature1 = scanner.nextDouble();
        System.out.println("Please enter second temperature : ");
        double Temperature2 = scanner.nextDouble();

        if (Temperature1<100 && Temperature2>100){
            boolean checkDevice = false;
            System.out.println("Device works well - " + checkDevice);
        }
        if (Temperature1>100 && Temperature2>100){
            boolean checkDevice = true;
            System.out.println("Device works well - " + checkDevice);
        }
        if (Temperature1<100 && Temperature2<100){
            boolean checkDevice = true;
            System.out.println("Device works well - " + checkDevice);
        }
        if (Temperature1>100 && Temperature2<100){
            boolean chekDevice = true;
            System.out.println("Device works perffect - " + chekDevice);
        }




    }
}
