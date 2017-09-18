package com.company;


import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        testSwitch(5);

        int checkedValue = 8;
        String resultMessage = testIf (checkedValue);
        printInConsole(resultMessage);



//        testFor(7, 4);
//        long[] numbers = testWhile(10);
//        testForeach(numbers);

//        String someValue = "balonka";
//        String userName = defineUserName(someValue);
//        printInConsole(userName);

    }

    public static void testSwitch(int value) {
        switch (value) {
            case 0:
                System.out.println("value = 0");
            case 1:
                System.out.println("value = 1");
                break;
            case 2:
                System.out.println("value = 2");
                return;
            case 3:
                System.out.println("value = 3");
                break;
            default:
                System.out.println("default case");
                break;
        }

        System.out.println("end of testSwitch method");
    }

    public static String defineUserName(String login) {
        switch (login) {
            case "tsyganochka":
                return "yulia n";
            case "balonka":
                return "danila";
            default:
                return "user wasn't found";
        }
    }

    public static String testIf(int value) {
        int remainder = value % 2;
        if (remainder == 0) {
//            System.out.println("even");
            return "even";
        } else {
//            System.out.println("not even");
            return "not even";
        }
    }

    public static void testFor(int value, int stopIndex) {
        for (int i = 0; i < value; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("i = " + i);
            if (i == stopIndex) {
                System.out.println("stop index was detected i = " + i);
                return;
            }
        }
    }

    public static long[] testWhile(int value) throws InterruptedException {
        int i = 0;
        long[] numbers = new long[value];
        while (i < value) {
            Thread.sleep(10L);
            numbers[i] = System.currentTimeMillis();
            i++;
        }
        return numbers;
    }

    public static void testForeach(long[] elements) {
        for (long currElement : elements) {
            System.out.println(currElement);
        }
    }

    public static void printInConsole (String message) {
        System.out.println (message);
    }
}
