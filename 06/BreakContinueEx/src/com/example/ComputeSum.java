package com.example;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
int input, sum = 0;
        for (int i = 0; i < 10; i++) {
        input = in.nextInt();
            if (input == 0) {
                break; //control jumps to update i++
            }
        sum += input;
            
        }
       System.out.println(sum);

    }
}
