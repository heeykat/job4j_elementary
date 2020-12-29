package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        // 1 выражение - c потерей
//        long l = 129;
//        byte b = (byte) l;
//        System.out.println(b);
//// 2 выражение - c потерей
//        float f = 12358.7f;
//        int i = 45981;
//        short rsl = (short) (f + i);
//        System.out.println(rsl);
//// 3 выражение - без потери
//        char c = 45000;
//        float i = c;
//        System.out.println(i);
//// 4 выражение - c потерей
//        double d = 121.19;
//        byte b = (byte) d;
//        System.out.println(b);
//// 5 выражение - без потери
//        short s = 1500;
//        char c = (char) s;
//        double d = c;
//        System.out.println(d);
    }
}
