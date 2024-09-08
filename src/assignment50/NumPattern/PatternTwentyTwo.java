package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentyTwo 
{

	public static void isTwentyTwo(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==i)
				{
					System.out.print(j+"");
				}
				else
				{
					System.out.print("0");
				}
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
		PatternTwentyTwo.isTwentyTwo(n);
	}

}
