/*
 
Program:.java          Last Date of this Revision: February 9, 2022
 
Purpose:Create a Digits application that prompts the user for a two-digit number and then displays the ones-place and tens-place digits.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 												Missing the three digits program
 
*/
package Assignments;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a 2 digit number:");
		int num = input.nextInt();
		input.close();
		int one = num/10;
		int two = num % 10;
		System.out.println("The number you entered is " + num);
		System.out.println("The first digit of the number is " + one);
		System.out.println("The second digit of that number is " + two);
	}

}
/*												Screen Dump missing
Please enter a 2 digit number:
87
The number you entered is 87
The first digit of the number is 8
The second digit of that number is 7
*/
