package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentySeven 
{
	public static void isTwentySeven(int n)
	{
		int c=4;
		for(int i=1;i<=n;i++)
		{
			c=4;
			int c1=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c1+" ");
				c1=c1+c;
				c--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternTwentySeven.isTwentySeven(n);
	}

}