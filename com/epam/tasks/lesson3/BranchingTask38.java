package com.epam.tasks.lesson3;

import java.util.Scanner;

public class BranchingTask38
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x = ");
		int x = Integer.parseInt(scan.nextLine());
		
		if(x >= 0 && x <= 3)
		{
			System.out.println(x * x);
		}
		else
		{
			System.out.println(4);
		}
	}
}
