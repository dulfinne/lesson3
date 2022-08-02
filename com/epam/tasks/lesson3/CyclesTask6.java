package com.epam.tasks.lesson3;

import java.util.Scanner;

public class CyclesTask6 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		int sum = 0;
		for(int i = 1 ; i <= n; i++)
		{
			sum += i;
		}
		System.out.print("sum = " + sum);
	}
}
