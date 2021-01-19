package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
//        int[][] numbers = new int[4][];
//        int count = 1;
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = new int[i + 1];
//            for (int j = 0; j < numbers[i].length; j++) {
//                numbers[i][j] = count;
//                count++;
//            }
//            System.out.println(
//                    "Размер вложенного массива равен: " + numbers[i].length
//            );
//        }
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}
