package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentySix {

	public static void isTwentySix(int n)
	{
		int x=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+"");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(x+"");
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
		PatternTwentySix.isTwentySix(n);
	}

}