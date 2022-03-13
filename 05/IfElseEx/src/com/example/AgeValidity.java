/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class AgeValidity {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
        System.out.println("Enter your age");    
        int myAge = sc.nextInt();   
        sc.close();
        boolean drivingUnderAge = false;

        
        drivingUnderAge = myAge <= 18;  
        System.out.println(drivingUnderAge);
        
        
       
    }
}
