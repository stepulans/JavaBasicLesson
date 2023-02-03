package Homework.FirstHomwork.CaloriesOfPizza;

public class CaloriesOfPizza {
    public static void main(String[] args) {
        int diameterOfPizza1 = 24;
        int diameterOfPizza2 = 28;

        int radiusOfPizza1 = diameterOfPizza1 / 2;
        int radiusOfPizza2 = diameterOfPizza2 / 2;

        double squareOfPizza1 = Math.PI * radiusOfPizza1 * radiusOfPizza1;
        double squareOfPizza2 = Math.PI * radiusOfPizza2 * radiusOfPizza2;

        double caloriesOfPizza1 = squareOfPizza1 * 40;
        double caloriesOfPizza2 = squareOfPizza2 * 40;
        System.out.println("Squere of small Pizza is " + squareOfPizza1);
        System.out.println("Square of big Pizza is " + squareOfPizza2);
        System.out.println("Total amount of calories in small Pizza is " + caloriesOfPizza1);
        System.out.println("Total amount of calories in big Pizza is " + caloriesOfPizza2);





    }
}