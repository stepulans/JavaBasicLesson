package Homework.secondHomework.Clock;

import java.util.Random;

public class Clock {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(28800);
        System.out.println(n + " seconds");

        int hours = n / 3600;
        if (hours >= 1) {
            System.out.println("There are " + hours + " hours left");
        } else if (hours == 0) {
            System.out.println("There is less than an hour left");
        } else {
            System.out.println("The workday has ended");
        }
    }
}

