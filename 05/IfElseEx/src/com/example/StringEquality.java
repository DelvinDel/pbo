/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */

import java.util.Scanner;
public class StringEquality {
   public static void main(String[] args) {
    String str;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a name: ");
    str = sc.nextLine();
    String king = "Moe";
    boolean check = king.equals(str);
if (check == true)
           System.out.println("You are the king of rock and roll");
else
           System.out.println("you are not the king");
    

}
}