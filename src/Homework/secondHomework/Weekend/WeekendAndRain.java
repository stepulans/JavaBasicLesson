package Homework.secondHomework.Weekend;

public class WeekendAndRain {
    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isRain = false;
        boolean canWalk;

        if (!isRain || isWeekend) {
            canWalk = false;

        } if (isRain || !isWeekend) {
            canWalk = true;
            System.out.println("We are going outside");
        }

    }
}