package com.epam.tasks.lesson3;

import java.util.Scanner;

public class BranchingTask32
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.print("b = ");
		int b = Integer.parseInt(scan.nextLine());
		System.out.print("c = ");
		int c = Integer.parseInt(scan.nextLine());
		
		if (a + b >= 0 || b + c >= 0 || a + c >= 0)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}