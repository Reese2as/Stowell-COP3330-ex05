/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int num1, num2, ans1, ans2, ans3, ans4;
        System.out.print("What is the first number? ");
        num1 = user_input.nextInt();
        System.out.print("What is the second number? ");
        num2 = user_input.nextInt();
        ans1 = (num1 + num2);
        ans2 = (num1 - num2);
        ans3 = (num1 * num2);
        ans4 = (num1 / num2);
        System.out.println(String.format("%d + %d = %d", num1, num2, ans1));
        System.out.println(String.format("%d - %d = %d", num1, num2, ans2));
        System.out.println(String.format("%d * %d = %d", num1, num2, ans3));
        System.out.println(String.format("%d / %d = %d", num1, num2, ans4));
    }
}