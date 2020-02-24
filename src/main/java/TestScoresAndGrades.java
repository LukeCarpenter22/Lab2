
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
public class TestScoresAndGrades {
    public static void main(String[] args) {
        
        System.out.println("Please enter test score 1");
        
        Scanner keyboard = new Scanner(System.in);
        double test1 = keyboard.nextDouble();
        
        System.out.println("Please enter test score 2"); 
        double test2 = keyboard.nextDouble();
        
        System.out.println("Please enter test score 3");
        double test3 = keyboard.nextDouble();
        
        double avg = (test1 + test2 + test3) / 3;
        
        
        if (avg < 60) {
            System.out.println("Your letter score is a F, The average of the scores is " + avg);
        } else if (avg < 70){
            System.out.println("Your letter score is a D, The average of the scores is " + avg);
        } else if (avg < 80){
            System.out.println("Your letter score is a C, The average of the scores is " + avg);
        } else if (avg < 90){
            System.out.println("Your letter score is a B, The average of the scores is " + avg);
        } else if (avg < 100){
            System.out.println("Your letter score is a A, The average of the scores is " + avg);
            
                   
        }
        
    }
}
