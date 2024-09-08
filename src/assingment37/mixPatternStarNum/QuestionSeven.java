/*
 * Q7
    1
    3*2
    6*5*4
    10*9*8*7

 */
package assingment37.mixPatternStarNum;
import java.util.Scanner;
public class QuestionSeven {
	public void seventhCode()
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
				System.out.print(c--);
				if(j<n-3 && i==1)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		c=3;
		for(int i=2;i<=2;i++)
		{
			for(int j=1;j<=n-2;j++)
			{
				if(i==2)
				System.out.print(c--);
				if(j<n-2 && i==2)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		c=6;
		for(int i=3;i<=3;i++)
		{
			for(int j=1;j<=n-1;j++)
			{
				if(i==3)
				System.out.print(c--);
				if(j<n-1 && i==3)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		c=10;
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
		Scanner sc = new Scanner(System.in);
		QuestionSeven q = new QuestionSeven();
		q.seventhCode();
	}
}
