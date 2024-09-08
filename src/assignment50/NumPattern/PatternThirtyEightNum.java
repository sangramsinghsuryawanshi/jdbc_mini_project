package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtyEightNum 
{
	public static void isThirtyEightNum(int n)
	{
		int num=63,c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
            	System.out.print(j+"");
            }
            for(int j=n;j>i;j--) 
            {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--) 
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
		PatternThirtyEightNum.isThirtyEightNum(n);
	}
}