package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentyNine 
{
	public static void isTwentyNine(int n)
	{
		int num = 1;
        for(int i=1;i<=n;i++)
        {
            int c1=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(c1+" ");
                c1 += 7-i;
                
            }
            c1--;
            System.out.println();
        }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternTwentyNine.isTwentyNine(n);
	}

}