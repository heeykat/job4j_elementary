package ru.job4j.array.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i * 2 + 3;
            System.out.println(numbers[i]);
        }
    }
}
