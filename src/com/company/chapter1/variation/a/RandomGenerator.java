package com.company.chapter1.variation.a;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Daniil Sheidak on 10.10.2017.
 */
public class RandomGenerator {
    public void processNumbers (){
        System.out.println("enter number of random numbers");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//ввод значений с калвиатуры
        Random rand = new Random();

        int[] randomNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            randomNumbers[i] = rand.nextInt(50);
        }

        System.out.println("each from new line? (y/n)");

        String newLine = scan.next();

        for (int i = 0; i < n; i++) {
            if ("y".equals(newLine)) {
                System.out.println(randomNumbers[i] + "\n");
            } else {
                System.out.println(randomNumbers[i]);
            }
        }





    }
}
