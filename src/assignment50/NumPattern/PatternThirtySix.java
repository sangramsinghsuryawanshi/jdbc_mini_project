package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtySix 
{
	public static void isThirtySix(int n)
	{
		int b=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
            	System.out.print(b);
            }
            for(int j=1;j<=i;j++)
            {
            	System.out.print(i);
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
		PatternThirtySix.isThirtySix(n);
	}
}

