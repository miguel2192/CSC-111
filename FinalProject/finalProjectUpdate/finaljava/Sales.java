/***************************************************************************
*                                                                          *
*                                                                          *
*            Miguel A. Rodriguez     CSC111                                *
*            prof Lemmo           4/15/2015                                *
*                                                                          *
*          This program asks the user to choose between two                *
*          different options.If the user chooses the employee option       *
*          than the program will compute the gross pay base on the hours   *
*          worked and the hourly rate. However if the user decides         *
*          to choose the sales person option than the program              *
*          asks the user to enter the total sales and the commision        *
*          rate and base on that it computes the commision. The            *
*          user the have the option to exit or to continue.                *                                
*                                                                          *
*                                                                          *
***************************************************************************/ 
import java.util.*;
import java.text.*;

public class Sales
{
	public static void main(String[] args) 
	{
	  
     Scanner scan = new Scanner(System.in);
 
     //variables
	   String name;
     int id;
     String e , s, x, choice;
     String another = "";
     double hoursWorked, hourlyRate;
    
    //constant
     final int MAX_SIZE = 10;

      /*asks the user if they wish to enter the program!*/
     System.out.println("Do you wish to enter the program<y or n>?: ");
     another = scan.nextLine();
     while (another.equalsIgnoreCase("y")) //creates repetition
     {
/*********************************************************************************/
//  This three lines of code below welcomes the user!
/*********************************************************************************/
  
System.out.println("\t********************************************************");
System.out.println("\t\tWELCOME TO THE WORKERS REPORT PROGRAM!");
System.out.println("\t********************************************************");
    
/********************************************************************************/
// The two lines of code below provide three different options to the user
/********************************************************************************/

 System.out.println("PLEASE ENTER \"(e)\" FOR EMPLOYER, \"(s)\" FOR SALES PERON "
                                                          +"OR \"(x)\" TO EXIT: ");
 choice = scan.nextLine();
     
  switch (choice)
     {
	  
       /********************************************************************/
      //  Employee case(e/E)
      /********************************************************************/
   case "e":
   case "E":
      {
       System.out.println("PLEASE ENTER THE NUMBER OF EMPLOYEES THAT YOU WISH TO "
                                                                     +"PROCESS: ");
	    int esize = scan.nextInt();
       scan.nextLine();

      if (esize<1 || esize >10)//error checks for range
      {    
          System.out.println("The value that you entered is incorrect!"
                                                          +" Please try again!");
            break;
          }

	      if (esize>MAX_SIZE)//error checks
	       {
	  		esize = MAX_SIZE;
	        } 

         Employee[] employees = new Employee[esize];//employee array

	   for (int i = 0; i<employees.length;i++)
	       {
		     System.out.println("PLEASE ENTER THE EMPLOYEES FIRST NAME: ");
		     name = scan.nextLine();
		  
        
		     System.out.println("PLEASE ENTER THE ID NUMBER: ");
		     id = scan.nextInt();
		 
        
		     System.out.println("PLEASE ENTER THE HOURS WORKED: ");
		     hoursWorked = scan.nextDouble();
		     scan.nextLine();
		  
		     System.out.println("PLEASE ENTER THE HOURLY RATE: ");
		     hourlyRate = scan.nextDouble();
		     scan.nextLine();
		  
		     employees[i] = new Employee(name,id,hoursWorked,hourlyRate);
		  
		        }//ends the first for loop(Employe loop)
              
              System.out.println("\n");
              System.out.println("\t\t\t EMPLOYEE(s) REPORT TABLE");
              System.out.println("****************************************************"
                                                       +"***************************");
              System.out.println("NAME\t\tID NUMBER\tHOURLY RATE\tHOURS WORKED\tGROSS PAY");
              System.out.println("****************************************************" 
                                                        + "***************************");
		 for(Employee emp:employees)
		       {
		  		  System.out.println(emp.toString());
		       }//ends employee for loop
		 
        
              }//ends case1
               System.out.print("\n");
               System.out.print("\n");
               System.out.print("\n");
               System.out.println("***************************************************"
                                                                   +"***************");
               System.out.println("\tTHANK YOU FOR USING THE EMPLOYEES REPORT PROGRAM!");
               System.out.println("***************************************************"
                                                                    +"***************");
                break;
              
 /**********************************************************************************/
 //   Sales Person Case (s/S)
 /*********************************************************************************/
    case "s":
    case "S":
         {
	        String sName;
		     int idNum;
		     double hoursW, hourlyR;
        
           System.out.println("PLEASE ENTER THE NUMBER OF SALES PEOPLE THAT YOU WISH"
                                                                  +"TO PROCESS: ");
           int ssize = scan.nextInt();

         if (ssize<1 || ssize >10)//error checks for range
           {    
          System.out.println("The value that you entered is incorrect!"
                                                         +"Please try again!");
             scan.nextLine();
             break;
            }
          
         if(ssize>MAX_SIZE)//error checks
            {
            ssize = MAX_SIZE;
             }

	         SalesPerson[] salesP = new SalesPerson[ssize];//sales person array
 
		   for(int h=0; h<salesP.length; h++)
		      {
		       scan.nextLine(); //cleans buffer
		     
		      System.out.println("PLEASE ENTER THE SALES PERSON'S FIRST NAME: ");
		      sName =scan.nextLine();
        
		  
		      System.out.println("PLEASE ENTER THE ID NUMBER: ");
		      idNum = scan.nextInt();
		  
		      System.out.println("PLEASE ENTER THE TOTAL SALES SOLD: ");
		      hoursW = scan.nextDouble();
		       scan.nextLine();
		  
		      System.out.println("PLEASE ENTER THE COMMISION RATE: ");
		      hourlyR = scan.nextDouble();
		      scan.nextLine();
		  
		   salesP[h] = new SalesPerson (sName,idNum,hoursW,hourlyR);
		  
		 }//ends the second for loop(sales person loop)
		  
		   System.out.println("");
            System.out.println("\t\t\t SALES PERSON(s) REPORT TABLE");
            System.out.println("********************************************************"
                                                          +"***********************");
            System.out.println("NAME\t\tID NUMBER\tTOTAL SALES\tCOMMISION RATE\tCOMMISION\t");
            System.out.println("*********************************************************"
                                                           +"**********************");
        for (SalesPerson sP: salesP)
            {
            System.out.println(sP.toString());
             }//sales person for loop
            }//ends case2
             System.out.print("\n");
             System.out.print("\n");
             System.out.print("\n");
             System.out.println("******************************************************"
                                                                        +"************");
             System.out.println("\tTHANK YOU FOR USING THE SALES PERSONS REPORT PROGRAM!");
             System.out.println("****************************************************"
                                                                       +"**************");
           break;

         
      case "x":
      case "X":
            {
            System.out.println("******************************************************"
                                                                        +"************");
            System.out.println("\tTHANK YOU FOR USING THE THE WORKERS REPORT PROGRAM!");
            System.out.println("*******************************************************"
                                                                        +"***********");
            another ="n";//exits 
             }

           }//ends for loop
           /***********************************************************************/
           // provides the option to continue
           /************************************************************************/
          System.out.println("Do you wish to enter the program again<y or n>?: ");
          another = scan.nextLine();
		  }//end switch
        System.out.println("Good Bye!");
      }//ends the method
	}// ends the class
		  	  
   /*
 Do you wish to enter the program<y or n>?: 
 y
 	********************************************************
 		WELCOME TO THE WORKERS REPORT PROGRAM!
 	********************************************************
 PLEASE ENTER "(e)" FOR EMPLOYER, "(s)" FOR SALES PERON OR "(x)" TO EXIT: 
 e
 PLEASE ENTER THE NUMBER OF EMPLOYEES THAT YOU WISH TO PROCESS: 
 3
 PLEASE ENTER THE EMPLOYEES FIRST NAME: 
 Peter
 PLEASE ENTER THE ID NUMBER: 
 764
 PLEASE ENTER THE HOURS WORKED: 
 40
 PLEASE ENTER THE HOURLY RATE: 
 10
 PLEASE ENTER THE EMPLOYEES FIRST NAME: 
 Sam
 PLEASE ENTER THE ID NUMBER: 
 894
 PLEASE ENTER THE HOURS WORKED: 
 55
 PLEASE ENTER THE HOURLY RATE: 
 10
 PLEASE ENTER THE EMPLOYEES FIRST NAME: 
 Tinker
 PLEASE ENTER THE ID NUMBER: 
 897
 PLEASE ENTER THE HOURS WORKED: 
 70
 PLEASE ENTER THE HOURLY RATE: 
 10
 
 
 			 EMPLOYEE(s) REPORT TABLE
 *******************************************************************************
 NAME		ID NUMBER	HOURLY RATE	HOURS WORKED	GROSS PAY
 *******************************************************************************
 Peter		00764		10.0		   40.0		      400.0
 Sam		   00894		10.0		   55.0		      625.0
 Tinker		00897		10.0		   70.0		      900.0
 
 
 
 ******************************************************************
 	THANK YOU FOR USING THE EMPLOYEES REPORT PROGRAM!
 ******************************************************************
 Do you wish to enter the program again<y or n>?: 
 y
 	********************************************************
 		WELCOME TO THE WORKERS REPORT PROGRAM!
 	********************************************************
 PLEASE ENTER "(e)" FOR EMPLOYER, "(s)" FOR SALES PERON OR "(x)" TO EXIT: 
 s
 PLEASE ENTER THE NUMBER OF SALES PEOPLE THAT YOU WISH TO PROCESS: 
 3
 PLEASE ENTER THE SALES PERSON'S FIRST NAME: 
 Peter
 PLEASE ENTER THE ID NUMBER: 
 764
 PLEASE ENTER THE TOTAL SALES SOLD: 
 4000
 PLEASE ENTER THE COMMISION RATE: 
 15
 
 PLEASE ENTER THE SALES PERSON'S FIRST NAME: 
 Sam
 PLEASE ENTER THE ID NUMBER: 
 894
 PLEASE ENTER THE TOTAL SALES SOLD: 
 5500
 PLEASE ENTER THE COMMISION RATE: 
 12
 
 PLEASE ENTER THE SALES PERSON'S FIRST NAME: 
 Tinker
 PLEASE ENTER THE ID NUMBER: 
 897
 PLEASE ENTER THE TOTAL SALES SOLD: 
 7000
 PLEASE ENTER THE COMMISION RATE: 
 10
 
 			 SALES PERSON(s) REPORT TABLE
 *******************************************************************************
 NAME		ID NUMBER	TOTAL SALES	COMMISION RATE	COMMISION	
 *******************************************************************************
 Peter		00764		4000.0		15.0%		      600.0
 Sam		   00894		5500.0		12.0%		      660.0
 Tinker		00897		7000.0		10.0%		      700.0
 
 
 
 ******************************************************************
 	THANK YOU FOR USING THE SALES PERSONS REPORT PROGRAM!
 ******************************************************************
 Do you wish to enter the program again<y or n>?: 
 y
 	********************************************************
 		WELCOME TO THE WORKERS REPORT PROGRAM!
 	********************************************************
 PLEASE ENTER "(e)" FOR EMPLOYER, "(s)" FOR SALES PERON OR "(x)" TO EXIT: 
 x
 ******************************************************************
 	THANK YOU FOR USING THE THE WORKERS REPORT PROGRAM!
 ******************************************************************
 Do you wish to enter the program again<y or n>?: 
 n
 Good Bye!*/
		  
		  
		  
		  
		  
