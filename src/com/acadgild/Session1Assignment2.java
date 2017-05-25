package com.acadgild;
import java.util.Scanner;
/**
 * --------------------------------------------------------
 * @author Deepak
 * --------------------------------------------------------
 * To print sum of two numbers without using plus operator
 * --------------------------------------------------------
 */

public class Session1Assignment2 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int a = s.nextInt();
		
		System.out.print("Enter Second Number: ");
		int b = s.nextInt();
		
		int sum=a-(b*-1);
		System.out.println("Sum of a and b is = "+sum);
	}

}
