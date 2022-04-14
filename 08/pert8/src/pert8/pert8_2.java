/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class pert8_2 {
    public static void main(String []args){
       /* ArrayList<String> nm = new ArrayList<>();
        nm.add("yodi");
        nm.add(0,"budi");
        nm.add(2,"doni");


        /*nm.remove(1);
        nm.remove("doni");
        System.out.println("isi arl: "+nm);
        for(String i:nm){
        System.out.println(i);}
    //
    Iterator<String> ite = nm.iterator();
    while (ite.hasNext()){
    System.out.println(ite.next());}
    //
    ListIterator<String> litr = nm.listIterator();
        System.out.println("maju");
    while (litr.hasNext()){
        System.out.println(litr.next());}
        System.out.println("mundur");
    while (litr.hasPrevious()){
        System.out.println(litr.previous());}
    //
    ArrayList<Integer> umur = new ArrayList<>();

    umur.add(10);
    umur.add(0,12);
umur.add(0,17);
umur.add(3,20);
umur.add(1,50);
        System.out.println(umur);
//
ArrayList<Integer> umur = new ArrayList<>();
umur.add(10); umur.add(100);
int tot=0;
for (int a:umur){
tot = tot + a;}
        System.out.println("total: "+ tot);*/

ArrayList<Integer> nilai = new ArrayList<>();
Scanner scan = new Scanner(System.in);
double jumlah = 0.0;
double rata2 = 0.0;
        System.out.print("ingin masukkan berapa data: ");
        int data = scan.nextInt();

for(int i=0;i<data;i++){
    System.out.print("masukkan nilai: ");
    nilai.add(scan.nextInt());}

for (int sk:nilai){
    jumlah += sk;}

rata2 = jumlah / data;

        System.out.println("rata-rata: "+rata2);


    }
}
