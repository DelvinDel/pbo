/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> nomor = new ArrayList<>();

nomor.add(11);
nomor.add(20);
nomor.add(31);
nomor.add(40);

Iterator<Integer> ite = nomor.iterator();
while (ite.hasNext()){
    System.out.println(ite.next());}
        
for(int i = 0;i<nomor.size();i++){
int a;
a = nomor.get(i);
    if(a % 2 == 0){
    nomor.remove(i);}
        
}        
    System.out.println(nomor);    
        
        
         
    }
}
