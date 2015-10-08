/****************************************************

*                                                   * 

*                                                   *

*                                                   *

*   CSC111           Author:Miguel A Rodriguez      *

*                                                   *

*   time_Converter.java   Homework pp2.6            *

*                                                   *

*                                                   *

****************************************************/

import java.util.*;

public class time_Converter1

{

   public static void main (String[] args)

   

   {

    Scanner scan = new Scanner(System.in);

    

    int hours;

    int minutes;

    int seconds;

   

    System.out.println ("Please Enter Number Of Hours: ");

    hours = scan.nextInt();

    

    System.out.println ("Please Enter Number Of Minutes: ");

    minutes = scan.nextInt();

    

    System.out.println ("Please Enter Number Of Seconds: ");

    seconds = scan.nextInt();

    

    

    int HourToSec = hours * 3600;

    int MinToSec = minutes * 60;

    int SecToSec = seconds * 1;

    

    int TotalSec = HourToSec + MinToSec + SecToSec;

    

    System.out.println ("Equivalence in Seconds: " + TotalSec); 

    

    }

   

}
