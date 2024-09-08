package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirtyTwo 
{
	public static void isThirtyTwo(int n)
	{
		int a = 0,b=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
               System.out.print(j+" ");
            }
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c);
            System.out.println();
        }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternThirtyTwo.isThirtyTwo(n);
	}

}