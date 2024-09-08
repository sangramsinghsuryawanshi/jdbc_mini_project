package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtyOne 
{
	public static void isThirtyOne(int n)
	{
		int num = 5,n1=5;
        for(int i=1;i<=n;i++)
        {
        	num=5;
            for(int j=1;j<=i;j++)
            {
                System.out.print(num--+" ");
            }
            for(int j=n;j>i;j--)
            {
                System.out.print(n1+" ");
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
		PatternThirtyOne.isThirtyOne(n);
	}

}