package com.airbus5717.lab2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String number = input.next();
        input.close();
        if (number.length() != 12) {
            System.out.println(number + " is an invalid input");
            System.exit(1);
        }
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            if (i % 2 != 0) sum += (number.charAt(i) - '0') * 3;
            else sum += number.charAt(i) - '0';
        }
        sum = 10 - sum % 10;
        System.out.println("The ISBN-13 number is " + number + (sum != 10 ? sum : 0));
    }
}
