/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package even;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
      System.out.println("Enter an integer");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x % 2 == 0 )
         System.out.println(" even number.");
      else
         System.out.println(" odd number.");
   }
    }

