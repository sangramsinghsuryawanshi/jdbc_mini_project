/*
 *  Q1
    1*2*3*4
    9*10*11*12
    13*14*15*16
    5*6*7*8
 */
package assingment37.mixPatternStarNum;

import java.util.Scanner;

public class QuationOne 
{
	public void firstCode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n = sc.nextInt();
		System.out.println("--------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1)
				{
					System.out.print(j);
				}
				else if(i==2)
				{
					System.out.print(8+j);
				}
				else if(i==3)
				{
					System.out.print(j+12);
				}
				else if(i==4)
				{
					System.out.print(j+4);
				}
				if(j<n)
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
		QuationOne q = new QuationOne();
		q.firstCode();
	}

}
