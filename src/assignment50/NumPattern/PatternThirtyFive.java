package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtyFive 
{
	public static void isThirtyFive(int n)
	{
		int b=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
            	if(i==j)
            	{
            		System.out.print(b+"");
            	}
            	else
            	{
            		System.out.print("0");
            	}
            }
            b++;
            System.out.println();
        }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternThirtyFive.isThirtyFive(n);
	}
}

