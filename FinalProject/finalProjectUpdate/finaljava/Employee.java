/***************************************************************************
*                                                                          *
*                                                                          *
*            Miguel A. Rodriguez     CSC111                                *
*            prof Lemmo           4/15/2015                                *
*                                                                          *
*          This is a sub-class of the Sales driver class. It computes and  *
*           returns the gross pay of the employee base on the hours worked *
*           and the hourly rate.                                           *                                
*                                                                          *
***************************************************************************/  
import java.text.*;

public class Employee
{
      //variables
	private String name;
	private int id;
	private double hoursWorked;
	private double hourlyRate;


	public Employee(String str0, int str1, double hworked, double hrate)//constructor
	{
		name = str0;
		id = str1;
		hoursWorked = hworked;
		hourlyRate = hrate;
	}

	public double grossPay()
	{  
     if (hoursWorked <= 40)
        {
     
		   double regularH= hoursWorked * hourlyRate; //Computes the regular hours
         return regularH;
         }
     else
        if(hoursWorked>=40 && hoursWorked<=60)
        {
            //computes the overtime hours
         double overtime = hoursWorked - 40;
         double overtimeT = (overtime * 1.5) * hourlyRate;
         double regularH = 40 * hourlyRate;
         double totalOvertime = regularH + overtimeT;
         return totalOvertime;
         } 
    else
         {
         
           //computes the double time hours
         double hoursDouble = hoursWorked - 60;
         double hoursDoubleT = (hoursDouble * 2)* hourlyRate;
         
         double overtime = (hoursWorked - 40) - hoursDouble;
         double overtimeT = (overtime * 1.5)* hourlyRate;
         
         double regularHours = 40 * hourlyRate;

         double totalDoubleH = regularHours + overtimeT + hoursDoubleT;
         return totalDoubleH;
         
         }
       
   
  
       
    }

	public String toString()
	{
       DecimalFormat fmt = new DecimalFormat("00000.#");
	   return name + "\t\t" + fmt.format(id) + "\t\t" + hourlyRate 
                  + "\t\t" + hoursWorked + "\t\t" + grossPay(); //retuns the values
		
	}//end toString
}//end class