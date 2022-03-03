/*
 
Program:.java          Last Date of this Revision: February 9, 2022
 
Purpose:Modify the Digits application created in a review earlier in this chapter to show the hundreds-place digit of a three digit number.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Exercises;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a 3 digit number:");
		int num = input.nextInt();
		input.close();
		int one = num/100;
		int two = num / 10 % 10;
		int three = num % 10;
		System.out.println("The number you entered is " + num);
		System.out.println("The number in the hundreds place is " + one);
		System.out.println("The number in the tens place is " + two);
		System.out.println("The number in the ones place is " + three);
	}

}
/*
Please enter a 3 digit number:
946
The number you entered is 946
The number in the hundreds place is 9
The number in the tens place is 4
The number in the ones place is 6
*/