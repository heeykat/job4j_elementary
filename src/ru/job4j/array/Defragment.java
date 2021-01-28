package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;
                for (int i = nullIndex; i < array.length; i++) {
                    if (array[i] != null) {
                        int notNullIndex = i;
                        String temp = array[nullIndex];
                        array[nullIndex] = array[notNullIndex];
                        array[notNullIndex] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}