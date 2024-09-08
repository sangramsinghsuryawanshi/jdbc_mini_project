package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtyNineNum 
{
	public static void isThirtyNineNum(int n)
	{
		int b=1;
		int c=3,b1=10;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
            	if(i%2==0)
            	{
            		System.out.print(c--+" ");
            		
                    b++;
            	}
            	else if(i==4)
            	{
            		System.out.print(b1--+"");
            	}
            	else
            	{
            		System.out.print(b+++" ");
            	}
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
		PatternThirtyNineNum.isThirtyNineNum(n);
	}
}
