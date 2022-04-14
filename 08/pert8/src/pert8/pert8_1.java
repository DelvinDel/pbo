/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert8;

import java.util.Scanner;
public class pert8_1 {

    public static void main(String args[]) {
    /*double scores[] = new double[10];
    double sum = 0.0, avg = 0.0;
        Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter scores of 10 students");
    for(int i = 0; i < scores.length; i++) {
    scores[i] = keyboard.nextInt();
    }
    System.out.println("Display the scores of 10 students");
    for(int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
    }
    for(int i = 0; i < scores.length; i++) {
    sum = sum + scores[i];
    avg = sum / scores.length;
    }
    System.out.println("The average score of the class: " + avg);*/
    //
    Scanner nil = new Scanner(System.in);
    int skor[] = new int[10];
    double rata2 = 0.0;
    double jumlah = 0.0;
    for (int i=0;i<10;i++){
        System.out.print("Masukkan data: ");
        skor[i] = nil.nextInt();
        jumlah+= skor[i];
    }
    for (int s:skor){
    System.out.println("Datanya: "+s);


    }
    rata2= jumlah / 10;
        System.out.println("rata-rata adalah: "+rata2);

        }
    }

    

