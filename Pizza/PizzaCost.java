/*****************************************
*                                        *
*   Miguel A. Rodriguez  CSC 111         *
*                                        *
*   pizzaCost.java   4/17/15             *
*                                        *
*   This is the main method program it   *
*   inputs the diameter of the pizza and *
*   the number of toppings. it also      *
*   outputs the final result.            *
*                                        *
*****************************************/

import java.util.Scanner;
import java.text.*;


   public class PizzaCost
   {  
   
      public static void main (String[] args)
      {
         int Diameter, Num_Of_Toppings;
         double Cost_Of_Pizza;
         
         Scanner scan = new Scanner(System.in);
         
         Pizza Pizza1 = new Pizza();
         System.out.println("Pizza 1: \t" + Pizza1 + "\n");
         
         Pizza Pizza2 = new Pizza(12,3);
         System.out.println("Pizza 2: \t" + Pizza2 + "\n");
         
         System.out.println("Please enter the diameter of the pizza:\t");
         Diameter = scan.nextInt();
         
         System.out.println("Please enter the Number of Toppings on pizza:\t");
         Num_Of_Toppings = scan.nextInt();
         
         Pizza2.SetPizza(Diameter, Num_Of_Toppings);
         
         System.out.print("\nNew Pizza 2:\t" + Pizza2 + "\n");
         
         Cost_Of_Pizza = Pizza2.ComputePizzaCost();
         
         NumberFormat fmt = NumberFormat.getCurrencyInstance();
         
         System.out.println("\n" + Pizza2 + " The cost of this pizza is " 
                     + fmt.format(Cost_Of_Pizza) + "\n"); 
         
         }
     }
     
     
     /* ----jGRASP: operation complete.
 
  ----jGRASP exec: java PizzaCost
 
 Pizza 1: 	This is a 1 inch pizza with 0 toppings.
 
 
 Pizza 2: 	This is a 12 inch pizza with 3 toppings.
 
 
 Please enter the diameter of the pizza:	
 17
 Please enter the Number of Toppings on pizza:	
 3
 
 New Pizza 2:	This is a 17 inch pizza with 3 toppings.
 
 
 This is a 17 inch pizza with 3 toppings.
  The cost of this pizza is $23.41
 
 
  ----jGRASP: operation complete.*/
 