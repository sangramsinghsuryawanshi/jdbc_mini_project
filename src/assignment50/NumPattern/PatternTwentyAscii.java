package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentyAscii 
{
	public static void isTwentyAscii(int n)
	{
		int as=69;
        for(int i=1;i<=n;i++)
        {
        	as=69;
            for(int j=1;j<=i;j++)
            {
            	System.out.print((char)as--);
            }
            as++;
            System.out.println();
        }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternTwentyAscii.isTwentyAscii(n);
	}
}
