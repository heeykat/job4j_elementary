package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double percentFr = percent / 100;
        double debt = (amount * percentFr + amount) - salary;
        while (debt > 0) {
            year++;
            debt = (debt * percentFr + debt) - salary;
        }
        return year;
    }
}