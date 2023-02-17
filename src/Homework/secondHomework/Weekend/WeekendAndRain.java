package Homework.secondHomework.Weekend;

public class WeekendAndRain {
    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isRain = true;
        boolean canWalk;

        if (isRain && isWeekend) {
            canWalk = false;

        } else  {
            canWalk = true;
            System.out.println("We are going outside");
        }

    }
}