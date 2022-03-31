/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package savingaccounts;


public class Savingaccounts {

    public double balance;
    public double interestRate;
    public String name;


public void displayCustomer(){
    System.out.println("Customer: "+ name);
    System.out.println("Balance: "+ balance);
    System.out.println("Rate: "+ interestRate);
}


public static void main (String[] args){
Savingaccounts sa = new Savingaccounts();

}
}