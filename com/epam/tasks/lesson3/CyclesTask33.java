package com.epam.tasks.lesson3;

import java.util.Scanner;

public class CyclesTask33 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x = ");
		int x = Integer.parseInt(scan.nextLine());
		int max = -1;
		while(x != 0)
		{
			if (x % 10 > max)
			{
				max = x % 10;
			}
			x /= 10;
		}
		System.out.println(max);
	}
}
