package assignment50.NumPattern;

import java.util.Scanner;

public class PatternTwentyThreeAscii 
{
	public static void isTwentyThreeAscii(int n)
	{
		int number =0;
        for(int i=1;i<=n;i++)
        {
        	for(int k=n;k>=i;k--)
        	{
        		System.out.print(" ");
        	}
        	for(int j=0;j<=i;j++)
			{
				if(i==0 || j==0)
				{
					number=1;
				}
				else
				{
					number=number*(i-j+1)/j;
				}
				  char letter = (char)(number + 64);  
	                System.out.print(letter + " ");
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
		PatternTwentyThreeAscii.isTwentyThreeAscii(n);
	}
}
