
package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
    int number = sc.nextInt();
for (int i =1;i<= 12;i++){
    System.out.println(number*i);
}

    }


}
