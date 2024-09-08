package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtyFiveNum 
{
	public static void isThirtyFiveNum(int n)
	{
		int num=63,c=68;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
            	System.out.print(j+" ");
            }
            for(int j=i;j>1;j--) 
            {
                System.out.print(j-1+" ");
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
		PatternThirtyFiveNum.isThirtyFiveNum(n);
	}
}