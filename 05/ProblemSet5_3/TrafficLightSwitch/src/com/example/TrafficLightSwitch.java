
package com.example;

import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color code");
        int code = sc.nextInt();
        sc.close();
        switch (code){
        case 1 : System.out.println("Next Traffic Light is green"); break;
        case 2 : System.out.println("Next Traffic Light is yellow"); break;
        case 3 : System.out.println("Next Traffic Light is red"); break;
        default : System.out.println("Invalid color");
    }

}
}
