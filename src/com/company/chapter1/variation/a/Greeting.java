package com.company.chapter1.variation.a;

import java.util.Scanner;

/**
 * Created by Daniil Sheidak on 10.10.2017.
 */
public class Greeting {
    public void greeting (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name and push enter:\n");
        String name = scan.next();
        System.out.println("Hi, " + name);
    }

}
