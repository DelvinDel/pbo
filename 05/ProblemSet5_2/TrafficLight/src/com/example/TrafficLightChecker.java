/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color code");
        int code = sc.nextInt();
        sc.close();
        if (code == 1){
            System.out.println("Next Traffic Light is green");}
        else if (code == 2){
            System.out.println("Next Traffic Light is yellow");}
        else if (code == 3){
            System.out.println("Next Traffic Light is red");}
        else System.out.println("Invalid color");
}

}
