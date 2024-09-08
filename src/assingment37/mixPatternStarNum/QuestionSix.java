/*
 * Q6
    1
    4*5*6
    2*3
    7*8*9*10

 */
package assingment37.mixPatternStarNum;

import java.util.Scanner;

public class QuestionSix {

	public void sixthCode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n = sc.nextInt();
		System.out.println("--------------------");
		int c=1;
		for(int i=1;i<=1;i++)
		{
			for(int j=1;j<=n-3;j++)
			{
				if(i==1)
				System.out.print(c++);
				if(j<n-3 && i==1)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		c=4;
		for(int i=2;i<=2;i++)
		{
			for(int j=1;j<=n-1;j++)
			{
				if(i==2)
				System.out.print(c++);
				if(j<n-1 && i==2)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		c=2;
		for(int i=3;i<=3;i++)
		{
			for(int j=1;j<=n-2;j++)
			{
				if(i==3)
				System.out.print(c++);
				if(j<n-2 && i==3)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		c=7;
		for(int i=4;i<=4;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==4)
				System.out.print(c++);
				if(j<n && i==4)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QuestionSix q = new QuestionSix();
		q.sixthCode();
	}

}
