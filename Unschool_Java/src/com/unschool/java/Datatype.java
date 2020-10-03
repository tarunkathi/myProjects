package com.unschool.java;

import java.util.Scanner;

public class Datatype {

	public static void main (String [] args) {
		//int myNum = 5;
		//float myFloatNum = 5.99f;
		//char myLetter = 'D';
		//boolean myBool = true;
		//String myText = "Unschool";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter User name");
		String myText = scan.nextLine();
		System.out.println("My Name is "+myText);

		System.out.println("Enter Integer");
		int myNum = scan.nextInt();
		System.out.println("My Integer Value is "+myNum);

		System.out.println("Enter Floating Point Number");
		float myFloatNum = scan.nextFloat();
		System.out.println("My Float Value is "+myFloatNum);

		System.out.println("Enter Character");
		char myLetter = scan.next().charAt(0);//Hey
		System.out.println("My Character Value is"+myLetter);

        scan.close();
   }
}