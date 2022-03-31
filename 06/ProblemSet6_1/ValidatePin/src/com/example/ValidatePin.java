
package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        int pin = 123456;
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter pin: ");
    int input = sc.nextInt();
    while (input != pin){
        System.out.print("Please re-enter pin: ");
        input = sc.nextInt();}
        System.out.println("Teh pin is correct and you can access the account");
    }
}
