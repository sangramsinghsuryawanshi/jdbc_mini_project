package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentyOneAscii 
{
	public static void isTwentyOneAscii(int n)
	{
		int number =1;
        for(int i=1;i<=n;i++)
        {
        	for(int k=n;k>=i;k--)
        	{
        		System.out.print(" ");
        	}
        	for(int j=0;j<=i;j++)
			{
				if(i==0 || j==0)
				{
					number=1;
				}
				else
				{
					number=number*(i-j+1)/j;
				}
				System.out.print(number+" ");
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
		PatternTwentyOneAscii.isTwentyOneAscii(n);
	}
}
