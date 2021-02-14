package ru.job4j.condition;

public class Max {

    public int max (int first, int second) {
        return first > second ? first : second;
    }

    public int max (int first, int second, int third) {
        return max(max(first, second), third);
    }

    public int max (int first, int second, int third, int fourth) {
        return max(max(first, second, third), fourth);
    }

//    public static void main(String[] args) {
//        Max.max(4, 5);
//        Max.max(6, 3);
//        Max.max(2, 2);
//    }

//    public static int max(int left, int right) {
//        int result = left > right ? left : right;
//        System.out.println(result);
//        return result;
//    }
}
