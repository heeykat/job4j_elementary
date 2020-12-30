package ru.job4j;

public class Echo {

    public static void main(String[] args) {

        System.out.println(Echo.checkGame(0.2, 50, 9));
    }

    public static int checkGame(double percent, int prize, int pay) {
        int v = (int) (percent * prize);
        if (v > pay) {
            return v - pay;
        } else {
            return 0;
        }
    }
}
