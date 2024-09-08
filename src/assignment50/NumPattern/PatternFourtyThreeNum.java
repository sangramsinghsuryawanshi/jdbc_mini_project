package assignment50.NumPattern;

import java.util.Scanner;

public class PatternFourtyThreeNum 
{
	public static void isFourtyThreeNum(int n)
	{
		int b=4;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--)
            {
               System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
        	b=1;
            for(int j=1;j<=i;j++)
            {
               System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--)
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
		PatternFourtyThreeNum.isFourtyThreeNum(n);
	}

}