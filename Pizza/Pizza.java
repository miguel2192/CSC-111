/******************************************
*                                         *
*   Miguel A. Rodriguez  CSC 111          *
*                                         *
*   pizzaCost.java     4/17/15            *
*                                         *
*   This is the pizza class of the        *
*   main method pizzaCost program. It     *
*    computes the the total cost of the   *
*    pizza based on the diameter and the  *
*    number of toppings.                  *
*                                         *
******************************************/

 public class Pizza
   {
      //constants
      final double COST_PER_SQ_IN = .08;
      final double COST_PER_TOPPING = 1.75;
      
      //data members
      private int Diameter;
      private int Num_Of_Toppings;
      
      //class methods
      
      // constructor
      public Pizza() 
      {
         Diameter = 1;
         Num_Of_Toppings = 0;
      }
      
      //overload default constructor
      public Pizza(int Value1, int Value2)
      {
         Diameter = Value1;
         Num_Of_Toppings = Value2;
      }
      
      public void SetPizza(int Value1, int Value2)
      {
         Diameter = Value1;
         Num_Of_Toppings = Value2;
      }
      
      public double ComputePizzaCost()
      {
         double Area, Pie_Cost, Toppings_Cost, Total_Cost, Radius;
         Radius = (float) Diameter/2;
         Area = Math.PI * Radius * Radius;
         Pie_Cost = Area * COST_PER_SQ_IN;
         Toppings_Cost = Num_Of_Toppings * COST_PER_TOPPING;
         Total_Cost = Pie_Cost + Toppings_Cost;
         
         return Total_Cost;
      }
      
      public String toString()
      {
         String Result;
         
         Result = "This is a " + Diameter + " inch pizza with " + Num_Of_Toppings + " toppings.\n";
         
         return Result;
         
      }
   }//end of class