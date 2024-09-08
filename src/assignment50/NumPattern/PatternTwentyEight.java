package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentyEight 
{
	public static void isTwentyEight(int n)
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
			int c1=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print((i*j)+" ");
			}
			System.out.println();
		}
		c=6;
		for(int i=1;i<n;i++)
		{
			int c1=1;
			for(int j=n;j>i;j--)
			{
				System.out.print((c1*c)+" ");
				c1++;
			}
			c++;
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternTwentyEight.isTwentyEight(n);
	}

}