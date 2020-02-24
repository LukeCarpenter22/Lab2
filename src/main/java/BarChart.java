
import javax.swing.JOptionPane;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukec
 */
public class BarChart {
    public static void main(String[] args) {
        
        int nStores = 5;
        String userInput;
        double storeSales;
        int nHundred;
        String output = "Sales Bar Chart\n";
                
        for ( int store = 0; store <= nStores; store++) {
            userInput = JOptionPane.showInputDialog( "Enter today's Sales for Store" + store);
            storeSales = Double.parseDouble( userInput );
            nHundred = (int) (storeSales / 100);
            output += "Store " + store + ": ";
            
            for( int asterisk = 1; asterisk <= nHundred; asterisk++) {
                output += "*";
            }
            output += "\n" ;
             }
        System.out.println(output);
    }
}
