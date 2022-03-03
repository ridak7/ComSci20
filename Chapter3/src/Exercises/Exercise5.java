/*
 
Program:.java          Last Date of this Revision: February 9, 2022
 
Purpose:Create a Change application that prompts the user for an amount less than $1.00 and then display the minimum number of coins necessary to make the change
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Exercises;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args)
	{
		       Scanner input = new Scanner(System.in);
			   System.out.println("Enter the change in cents:");
			   int num = input.nextInt();
			   int quarters = num / 25;
			   int dimes = num % 25 / 10;
			   int nickels = num % 25 % 10 / 5;
			   int penny = num % 25 % 10 % 5 / 1;
			   System.out.println("The change you provided is: " + num);
			   System.out.println("Quarters: " + quarters);
			   System.out.println("Dimes: " + dimes);
			   System.out.println("Nickels: " + nickels);
			   System.out.println("Pennys: " + penny);

	}

}
/*
Enter the change in cents:
546
The change you provided is: 546
Quarters: 21
Dimes: 2
Nickels: 0
Pennys: 1
*/