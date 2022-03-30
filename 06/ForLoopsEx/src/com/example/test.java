/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.util.Scanner;


public class test {
    public static void main(String[]args){
    int jum,data,tot=0;
    Scanner masuk = new Scanner(System.in);
        System.out.print("jumlah data?: ");
    jum = masuk.nextInt();
    for (int i = 1; i<=jum; i++){
        System.out.print("Masukkan data: ");
        data = masuk.nextInt();
        tot += data;
        }
        System.out.println("total: "+tot);
     }
}
