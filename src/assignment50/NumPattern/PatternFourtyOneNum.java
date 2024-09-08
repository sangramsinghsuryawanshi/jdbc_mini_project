package assignment50.NumPattern;

import java.util.Scanner;

public class PatternFourtyOneNum 
{
	public static void isFourtyOneNum(int n)
	{
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
            	System.out.print(j+"");
            }
            for(int j=1;j<i;j++) 
            {
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++) 
            {
                System.out.print(j+"");
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
		PatternFourtyOneNum.isFourtyOneNum(n);
	}
}