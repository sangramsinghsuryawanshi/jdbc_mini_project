package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtySixNum 
{
	public static void isThirtySixNum(int n)
	{
		int num=63,c=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
            	System.out.print((1 + 2 * (i + j))+" ");
            }
            for(int j=0;j<i;j++) 
            {
                System.out.print(1+2*j+" ");
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
		PatternThirtySixNum.isThirtySixNum(n);
	}
}