package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentyThree 
{
	public static void isTwentyThree(int n)
	{
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("1");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+"");
			}
			System.out.println();
			x++;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternTwentyThree.isTwentyThree(n);
	}

}
