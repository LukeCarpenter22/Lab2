
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukec
 */
public class BankCharges {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter number of checks written this month");
        
        double checks = keyboard.nextDouble();
        double price = 0;
        
         
        
        if (checks < 20){
            price = 10 + (.1 * checks);
         } else if (checks < 40) {
            price = 10 + (.08 * checks);
         } else if (checks < 60) {
             price = 10 + (.06 * checks);
         } else if (checks > 60) {
             price = 10 + (.04 * checks);
            }
        System.out.println("The service fees for the month are " + price + " Dollars");
        
    }
}
