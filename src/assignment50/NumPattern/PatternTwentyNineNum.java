package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentyNineNum 
{
	public static void isTwentyNineNum(int n)
	{
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
            	System.out.print(j+" ");
            }
            System.out.println();
        }
        int c=1;
        for(int i=2;i<=n;i++)
        {
        	c=1;
            for(int j=i;j>=1;j--)
            {
            	System.out.print(j+" ");
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
		PatternTwentyNineNum.isTwentyNineNum(n);
	}
}
