package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float input = getFloatInput();
        System.out.println("input number" + input);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input fractional number");
        while (true) {
            try {
                float input = Float.parseFloat(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("invalid number format");
            }
        }
    }
}