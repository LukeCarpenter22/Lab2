
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
public class SumOfNumbers {
    public static void main(String[] args) {
         
        System.out.println("Enter positive nonzero integer value");
        Scanner keyboard = new Scanner(System.in);
        
        int userNumber = keyboard.nextInt();
        int sum = 0;
        
        
        for (int number = 1; number <= userNumber; number ++){
                sum = sum + number;
        }
        System.out.println("The sum is " + sum);
        
        
        
        
    }
}
