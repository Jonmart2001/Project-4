/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Project4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in); 
     System.out.println("Enter a Whole Number: ");
         int num = reader.nextInt(); 
          int x = num;
        while( x > 0)
                {
         System.out.print(x);
         x--;
         
         System.out.print("\n");
    
}
}
}