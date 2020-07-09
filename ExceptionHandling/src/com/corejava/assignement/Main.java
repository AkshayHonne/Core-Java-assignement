package com.corejava.assignement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the First Name of a Person:");
				@SuppressWarnings("unused")
				String name = sc.next();
				
				System.out.println("Enter the age of a Person:");
				
				int age = sc.nextInt();
				
				if (age <=18 || age >60)
				{
					System.out.println("Age is INVALID and should be >=18  and < 60");
				}
			} catch (Exception e)
			{
				
					System.out.println("Age is INVALID and should be >=18  and < 60");
				
			}
				
			
	}

}