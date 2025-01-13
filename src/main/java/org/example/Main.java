package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        int randomNumber = rand.nextInt(1000);

        System.out.println("Your number is " + randomNumber);
    }
}