package assingment37.mixPatternStarNum;

import java.util.Scanner;

public class QuestionEleven {
	public void eleventhCode()
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
		c=4;
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QuestionEleven q = new QuestionEleven();
		q.eleventhCode();
	}

}