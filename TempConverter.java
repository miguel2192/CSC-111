/*************************************************************
*                                                            *
*   Miguel A. Rodriguez    CSC 111                           *
*   timeConverter.java  4/17/15  PP2.4                       *
*   This program asks the user to input the temperature in   *
*   fahrenheit and convert it into celcius.                  *
*************************************************************/
import java.util.*;
import java.text.*;

public class TempConverter
{
 public static void main(String[] args)
 {
 double fahrenheit, celcius;
 
 Scanner scan  = new Scanner(System.in);
 DecimalFormat fmt = new DecimalFormat("0.##");
 
 System.out.println("Please enter the temperature in fahrenheit: ");
 fahrenheit = scan.nextDouble();
 
 celcius = (fahrenheit-32)*5/9;
 
 System.out.println("The fahrenheit temperature in celcius is: " + fmt.format(celcius));
 
 System.out.println();
 System.out.println("Thank you");
 
 }//end method
}//end class
/* Please enter the temperature in farenheit: 
 
  ----jGRASP: process ended by user.
 
  ----jGRASP exec: java TempConverter
 
 Please enter the temperature in fahrenheit: 
 20
 The fahrenheit temperature in celcius is: -6.67
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java TempConverter
 
 Please enter the temperature in fahrenheit: 
 50
 The fahrenheit temperature in celcius is: 10
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java TempConverter
 
 Please enter the temperature in fahrenheit: 
 10
 The fahrenheit temperature in celcius is: -12.22
 
  ----jGRASP: operation complete.*/


 
 
