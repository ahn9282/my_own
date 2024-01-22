package jajava;

import java.util.*;

public class Testemonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Month today = null;
		Calendar cal = Calendar.getInstance();

		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);

		switch (month) {
		case 1:
			today = Month.January;
			break;
		case 2:
			today = Month.Feburary;
			break;
		case 3:
			today = Month.march;
			break;
		case 4:
			today = Month.April;
			break;
		case 5:
			today = Month.May;
			break;
		case 6:
			today = Month.June;
			break;
		case 7:
			today = Month.July;
			break;
		case 8:
			today = Month.August;
			break;
		case 9:
			today = Month.september;
			break;
		case 10:
			today = Month.October;
			break;
		case 11:
			today = Month.November;
			break;
		case 12:
			today = Month.December;
			break;

		}

		System.out.println("This month is " + today + " " + month + " " + year);
		boolean tf = true;
		if(tf)
			{
				System.out.println("true");
			}
		else
			{
				System.out.println();
			};
	}


}
