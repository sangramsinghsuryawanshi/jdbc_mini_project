package assignment50.NumPattern;

import java.util.Scanner;

public class PatternFourtyFiveNum 
{
	public static void isFourtyFiveNum(int n)
	{
		int b=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print(i+" ");
            }
            System.out.println();
        }
    	int b1=6;
        for(int i=1;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
               System.out.print(b1+" ");
            }
            System.out.println();
            b1++;
        }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternFourtyFiveNum.isFourtyFiveNum(n);
	}

}