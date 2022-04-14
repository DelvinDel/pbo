/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert8;

import java.util.Scanner;

/**
 *
 * @author pisco
 */
public class pert8_3 {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = 100,b,c,res;
    try {
        System.out.println("nilai b : ");
        b = s.nextInt();
        res = a/b;
        System.out.println(res);
    } catch(Exception e){
        String errMsg = e.getMessage();
        System.out.println(errMsg);}
    
    }
}

