package com.epam.tasks.lesson3;

import java.util.Scanner;

public class BranchingTask18
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
		
		int count = 0;
		
		if (a < 0)
		{
			count++;
		}
		
		if (b < 0)
		{
			count++;
		}
		
		if (c < 0)
		{
			count++;
		}
		
		System.out.println(count);
	}
}