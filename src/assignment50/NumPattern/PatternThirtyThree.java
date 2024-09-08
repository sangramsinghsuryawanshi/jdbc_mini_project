package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtyThree 
{
	public static void isThirtyThree(int n)
	{
		int b=4;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
               System.out.print(j+" ");
            }
            b=4;
            for(int j=i;j<n;j++)
            {
               System.out.print(b--+" ");
            }
            System.out.println();
        }
        
        b=4;
        for(int i=2;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
               System.out.print(j+" ");
            }
            b=4;
            for(int j=i;j<n;j++)
            {
               System.out.print(b--+" ");
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
		PatternThirtyThree.isThirtyThree(n);
	}

}