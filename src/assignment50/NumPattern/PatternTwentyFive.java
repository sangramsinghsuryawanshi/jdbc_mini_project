package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentyFive {

	public static void isTwentyFive(int n)
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
			c++;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternTwentyFive.isTwentyFive(n);
	}

}