/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
                
        int moviePrice = scan.nextInt();
        
        System.out.print("Enter the movie rating \n");
        
        int movieRating = scan.nextInt();
        
    scan.close();
        if(moviePrice >= 12 && movieRating == 5){
        System.out.println("I'm interested in watching the movie");}
        else{
        System.out.println("I am not interested in watching movie");}
        

    }
}
