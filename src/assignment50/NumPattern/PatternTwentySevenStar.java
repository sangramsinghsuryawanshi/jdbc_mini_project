package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentySevenStar 
{
	public static void isTwentySevenStar(int n)
	{
        for(int i=1;i<=n;i++)
        {
        	for(int j=n;j>=i;j--)
            {
            	System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
            	System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
            	System.out.print(" ");
            }
        	for(int j=n;j>=i;j--)
            {
            	System.out.print("*");
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
		PatternTwentySevenStar.isTwentySevenStar(n);
	}
}