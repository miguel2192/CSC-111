/***************************************************************************
*                                                                          *
*                                                                          *
*            Miguel A. Rodriguez     CSC111                                *
*            prof Lemmo           4/15/2015                                *
*                                                                          *
*          This is a sub-class of the Sales driver class. It computes and  *
*           returns the commision if the sales person.                     *                                
*                                                                          *
***************************************************************************/                                                                         

import java.text.*;

public class SalesPerson
{
         //Variables
   private String name;
	private int id;
   private double sales;
	
	private double commisionRate;
     //constructor
	public SalesPerson(String str0, int str1, double sales1, double commisionR)
                                    
	{
		name = str0;
		id = str1;
		sales = sales1;
	   commisionRate = commisionR;
	}

	public double commision()
	{
		return sales * (commisionRate/100);//Computes the commision
	}

	public String toString()
	{
		DecimalFormat fmt2 = new DecimalFormat("00000.#");
		return name + "\t\t" + fmt2.format(id) + "\t\t" + sales + "\t\t" 
                  + commisionRate +"%" + "\t\t"+ commision();//returns the values
	}
}