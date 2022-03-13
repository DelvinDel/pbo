/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        double wavelength;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color code: ");
    wavelength = sc.nextDouble();
        sc.close();
        String color;
        if (wavelength > 380 && wavelength <450 ){
        color = "Violet";
        System.out.println("The color is "+ color);}

        else if (wavelength > 450 && wavelength <495 ){
        color = "Blue";
        System.out.println("The color is "+ color);}

        else if (wavelength > 495 && wavelength <570 ){
        color = "Green";
        System.out.println("The color is "+ color);}

        else if (wavelength > 570 && wavelength <590 ){
        color = "Yellow";
        System.out.println("The color is "+ color);}

        else if (wavelength > 590 && wavelength <620 ){
        color = "Orange";
        System.out.println("The color is "+ color);}

        else if (wavelength > 620 && wavelength <750 ){
        color = "Red";
        System.out.println("The color is "+ color);}

        

        else{
        System.out.println("The entered wavelength is nor part of visible spectrum");
        }
        }
    }
