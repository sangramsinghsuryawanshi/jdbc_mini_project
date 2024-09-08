/*
 * Q10
    1
    2*2
    3*3*3
    4*4*4*4
    3*3*3
    2*2
    1

 */
package assingment37.mixPatternStarNum;

import java.util.Scanner;

public class QuestionTen {
	public void tenthCode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n = sc.nextInt();
		System.out.println("--------------------");
		int c=1;
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
		c=3;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=n-1;j>=i;j--)
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QuestionTen q = new QuestionTen();
		q.tenthCode();
	}

}