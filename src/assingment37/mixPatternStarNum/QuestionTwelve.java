/*
 * 6*6*6*6
    5*5*5
    4*4
    3
    3
    4*4
    5*5*5
    6*6*6*6


 */
package assingment37.mixPatternStarNum;

import java.util.Scanner;

public class QuestionTwelve {

	public void TwelvethCode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n = sc.nextInt();
		System.out.println("--------------------");
		int c=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(c);
				if(j>i)
				{
					System.out.print("*");
				}
			}
			c--;
			System.out.println();
		}
		c=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				if(j<i)
				{
					System.out.print("*");
				}
			}
			c++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QuestionTwelve q = new QuestionTwelve();
		q.TwelvethCode();
	}

}