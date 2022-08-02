package com.epam.tasks.lesson3;

import java.util.Scanner;

public class CyclesTask18 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = Integer.parseInt(scan.nextLine());
		double e = 0.1;
		
		double sum = 0;
		for(int i = 1 ; i <= n; i++)
		{
			double el = Math.pow(-1, i - 1) / n;
			if(el >= e)
			{
				sum += el;
			}
		}
		System.out.print(sum);
	}
}
