/**
 * 
 */
package com.java.assignement;

import java.util.Scanner;

/**
 * @author akshay
 *
 */
public class factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calFact f1 = new calFact();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number to find a Factorial");
		int i= sc.nextInt();
		System.out.println("Factorial of a number: "+ i + " = " +f1.fact(i));
		
		}


}
