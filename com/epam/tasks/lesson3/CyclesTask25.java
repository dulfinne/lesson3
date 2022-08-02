package com.epam.tasks.lesson3;

import java.util.Scanner;

public class CyclesTask25 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		int factorial = 1;
		for(int i = 2 ; i <= n; i++)
		{
			factorial *= i;
		}
		System.out.print(factorial);
	}
}
