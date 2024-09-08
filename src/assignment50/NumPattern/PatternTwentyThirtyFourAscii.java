package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentyThirtyFourAscii 
{
	public static void isTwentyThirtyFourAscii(int n)
	{
		int num=63,c=68;
        for(int i=0;i<=n;i++)
        {
        	for(int j=n;j>=i;j--)
            {
            	System.out.print(" ");
            }
        	num=65;
            for(int j=0;j<=i;j++)
            {
            	System.out.print((char)('A'+j)+" ");
            }
            for(int j=i-1;j>=0;j--) 
            {
                System.out.print((char)('A'+j)+" ");
            }
           // c--;
            System.out.println();
        }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternTwentyThirtyFourAscii.isTwentyThirtyFourAscii(n);
	}
}