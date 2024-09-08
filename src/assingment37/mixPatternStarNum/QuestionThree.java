/*
 * Q3
    4*3*2*1
    12*11*10*9
    8*7*6*5
    16*15*14*13

 */
package assingment37.mixPatternStarNum;

import java.util.Scanner;

public class QuestionThree 
{
	public void thirdCode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n = sc.nextInt();
		System.out.println("--------------------");
		int c=4;
		for(int i=1;i<=1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1)
				System.out.print(c--);
				if(j<n && i==1)
				{
					System.out.print("*");
				}
			}
			for(int j=1;j<=n;j++)
			{
				if(i==2)
				System.out.print(c--);
				if(j<n && i==2)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		c=12;
		for(int i=2;i<=2;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==2)
				System.out.print(c--);
				if(j<n && i==2)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		c=8;
		for(int i=3;i<=3;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==3)
				System.out.print(c--);
				if(j<n && i==3)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		c=16;
		for(int i=4;i<=4;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==4)
				System.out.print(c--);
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
		QuestionThree q = new QuestionThree();
		q.thirdCode();
	}

}
