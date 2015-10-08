/******************************************
*                                         *
*                                         *
*  Miguel A Rodriguez 3/27/15             *
*                                         *
*   CSC 111      waterBill22.java         *
*                                         *
******************************************/
import java.util.Scanner;
import java.text.*;


public class waterBill27
{

  public static void main (String[] args)
    {    
   
        
     String accountName;
     int accountNum;
     double gallonsUsed;
     String letterType;
     double amount = 0;
     String another;
     double line;  
 
      Scanner scan = new Scanner(System.in);
      another = "Y";
      DecimalFormat fmt = new DecimalFormat("0.##");
   
      while (another.equalsIgnoreCase("Y")) 
       { 
           
      System.out.println("Welcome to the Onondaga Water Bill Calculator");
      System.out.println();

      System.out.println("Please enter your account name: ");
      accountName = scan.nextLine();

      System.out.println("Please enter your 5 digit account number: ");
      accountNum = scan.nextInt();

      System.out.println("please enter the number of gallons used this quarter: ");
      gallonsUsed = scan.nextDouble();
     

     
      System.out.print("please choose from the following account types: \n"
      
      + "\n H for residential" 
      + "\n C for commercial"
      + "\n I for Industrial\n");
      
      letterType = scan.next();
     
      
     switch (letterType)
           {
      
           case "H":
           case "h":
           
                   System.out.println("Account Type: " + "Residential");
                   line = 22.09;
          
      
        
                   if (gallonsUsed<=10000) 
          
                   {
                   
        
          
                          amount=(gallonsUsed/1000)*2.42;
                          amount=amount+22.09;//we are adding line fee to amount 
           
         
        
                    }
           
                          else 
                              if(gallonsUsed>10000 && gallonsUsed<=23000) 
               
                              {
             
                            amount= (10000/1000)*2.42;            
                            double y=gallonsUsed-10000; 
             
           
                             amount=amount+(((y)/1000)*3.22);
             
                             amount=amount+ line; //line is added to the amount
                               }
              
      
                              else
                                {
             
                              amount= (10000/1000)*2.42;//first 10000
             
                              double x=gallonsUsed-10000; //get value for next 13000
                              amount=amount+(((23000)/1000)*3.22);
                              x=x-23000;//values thar exceeded 23000;
                              amount=amount+(((x)/1000)*4.03);//get values that exceeded 23000
                              amount=amount+line;//add line
            
                                 }
                       
                        System.out.println("Gallons Used: " + gallonsUsed);
                        System.out.println("Amount due: "+ "$" + fmt.format(amount));
              
                         break;
            
         
         case "C":
         case "c":
            
             
                        System.out.println("Account Type: " + "Commercial");
                        
                        amount = (gallonsUsed/1000)* 2.65;
                        amount = amount  + 22.09;
             
            
              
                        System.out.println("Gallons used: " + gallonsUsed);
                        System.out.println("Amount Due: "+ "$" + fmt.format(amount));
           
                       break;
                
      
         case "I":
         case "i":
         
                System.out.println("Account Type: " + "Industrial");
              
              line = 18.41;
              
                  if (gallonsUsed>=200000)
                    {
                        amount=(gallonsUsed/1000)* 2.16;
                        amount=amount+ line;
             
                    }

                 else 
                    if (gallonsUsed>200000 && gallonsUsed<=2500000)
                      {
                        amount= (200000/1000)*2.16;
             
                        double y=gallonsUsed-200000; 
                
                        amount=amount+(((y)/1000)*1.73);
             
                        amount=amount+ line;            
                      }

                  else 
                     if (gallonsUsed>2500000 && gallonsUsed<=2700000)
                      {
                        amount= (2500000/1000)*1.73;
             
                        double y=gallonsUsed-2500000; 
                
                        amount=amount+(((y)/1000)*4.03);
             
                        amount=amount+ line;   
                
                       }
         
                   else
                        {
                        amount= (200000/1000)*2.16;
             
                        double x=gallonsUsed-200000; 
                        amount=amount+(((2700000)/1000)*1.73);
                        x=x-2700000;//values that exceeded 2700000;
                        amount=amount+(((x)/1000)*4.03);
                        amount=amount+ line;
                
                        }
                        System.out.println("Gallons Used: " + gallonsUsed);
                        System.out.println("Amount Due: " + "$" + fmt.format(amount));
                
                      break;   
                   
                  
                   default:
         
                        System.out.println("Error, Please try again");
             
                  } //end switch
                  
                       System.out.print("Do you have another account to process < Y or N >?\t");
                       another = scan.next();
                  
                  } //end while
                  
                 
            }//end method
         

         
 }//end class 
 
 /* Welcome to the Onondaga Water Bill Calculator
 
 Please enter your account name: 
 Sanderson Family
 Please enter your 5 digit account number: 
 00045
 please enter the number of gallons used this quarter: 
 15278.65
 please choose from the following account types: 
 
  H for residential
  C for commercial
  I for Industrial
 h
 Account Type: Residential
 Gallons Used: 15278.65
 Amount due: $63.29
 Do you have another account to process < Y or N >?	y
 Welcome to the Onondaga Water Bill Calculator
 
 Please enter your account name: 
 Please enter your 5 digit account number: 
 00045
 please enter the number of gallons used this quarter: 
 15278.65
 please choose from the following account types: 
 
  H for residential
  C for commercial
  I for Industrial
 c
 Account Type: Commercial
 Gallons used: 15278.65
 Amount Due: $62.58
 Do you have another account to process < Y or N >?*/
