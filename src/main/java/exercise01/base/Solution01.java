package exercise01.base;/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Zakaria Antifit
 */

import java.util.Scanner;

public class Solution01 {
    /*
     * Print "What is your name?"
     * 'name' = user input string
     * print "Hello, 'name', nice to meet you!"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();
        String phrase = "Hello, " + name + ", nice to meet you!";
        System.out.println(phrase);
    }
}
