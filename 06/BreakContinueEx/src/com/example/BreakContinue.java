
package com.example;

import java.util.Scanner;


public class BreakContinue {
    
    public static void main( String [] args ) {

               for( int i = 0 ; i < 10 ; i++ ) {

                     if( i % 2 == 0) { 
                         break;
                     }

                     System.out.println("The number is " + i );

                     if( i == 7 ) {
                          break;
                      }

               }
        }

}
