package com.epam.tasks.lesson3;

import java.util.Scanner;

public class BranchingTask24
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of petals: ");
		int n = Integer.parseInt(scan.nextLine());
		
		if(n % 2 == 1)
		{
			System.out.println("loves");
		}
		else
		{
			System.out.println("doesn\'t love");
		}
	}
}
