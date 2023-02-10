package Homework.secondHomework.MoneyWithDrawing;

public class MoneyWithDrawing {
    public static int calculateDays(int N) {
    int days = 0;
    while (N > 0) {
        int maxWithdrawal = N / 2;
        N = N - maxWithdrawal;
        days++;
        if (N == 1) {
            N = N - 1;
            days++;
            break;
        }
    }
    return days;
}

    public static void main(String[] args) {
        int N = 21;
        int days = calculateDays(N);
        System.out.println("It will take " + days + " days to withdraw all the money.");
    }
}
