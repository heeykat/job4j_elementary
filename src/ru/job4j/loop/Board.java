package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if (row % 2 == 0) {
                    if (cell % 2 == 0) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (cell % 2 != 0) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("доска 3 на 3");
        paint(3, 3);
        System.out.println("доска 4 на 4");
        paint(4, 4);
        System.out.println("доска 5 на 5");
        paint(5, 5);
    }
}

