package ru.job4j.condition;

public class Max {

    public static void main(String[] args) {
        Max.max(4, 5);
        Max.max(6, 3);
        Max.max(2, 2);
    }

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        System.out.println(result);
        return result;
    }
}
