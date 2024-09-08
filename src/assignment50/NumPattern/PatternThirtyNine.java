package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtyNine 
{
	public static void isThirtyNine(int n)
	{
		int ascii=65;
        for(int i=1;i<=n;i++)
        {
        	ascii=65;
        	for(int j=n;j>=i;j--)
            {
            	System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
            	System.out.print((char)ascii+++" ");
            }
            System.out.println();
        }
        int c=65;
        for(int i=2;i<=n;i++)
        {
        	c=65;
        	for(int j=1;j<=i;j++)
            {
            	System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
            {
            	System.out.print((char)c+++" ");
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
		PatternThirtyNine.isThirtyNine(n);
	}
}
