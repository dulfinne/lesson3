package com.epam.tasks.lesson3;

import java.util.Scanner;

public class BranchingTask4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.print("b = ");
		int b = Integer.parseInt(scan.nextLine());
		
		if (a == b)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}
