package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtyFourNum 
{
	public static void isThirtyFourNum(int n)
	{
		int num=63,c=68;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
            	System.out.print(j+" ");
            }
            for(int j=1;j<i;j++) 
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
		PatternThirtyFourNum.isThirtyFourNum(n);
	}
}