import java.util.*;
class calendar
{
	public static void main(String args[])
	{

		//For printing a specific single month
		//printmonth(2,2023);   //month ranges from 1-12

		//for printing the calendar of specific year
		for(int i = 1; i<=12; i++)
		{
			printmonth(i,2024);
			System.out.println();
		}
		System.out.println("@ Copyright by Rutvik Raut");

	}
	public static void printmonth(int mm, int yy)
	{
		String month[] = {"January","February","March","April","May","June","July","August","September","Octomber","November","December"};
		int lastdate[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(month[mm-1]+" - "+yy);
		System.out.println("SU  MO  TU  WE  TH  FR  SA");
		GregorianCalendar cobj = new GregorianCalendar(yy,mm-1,1);
		int leadspace = cobj.get(Calendar.DAY_OF_WEEK)-1;    //ranges from(1-7)
		int i;
		for(i =1; i<=leadspace; i++ )
		{
			System.out.print("    ");    //space betn two day
		}
		int ld = lastdate[mm-1];
		if (mm==2 && cobj.isLeapYear(yy))          //checks condition for leap year
		{
			ld++;
		}
		for(i = 1; i<=ld; i++)
		{
			if(i<=9)
			{
				System.out.print(" ");
			}
			System.out.print(i+ "  ");
			if((i+leadspace)%7 ==0)
			{
				System.out.println();
			}
			//System.out.println();
		}
	}
}
