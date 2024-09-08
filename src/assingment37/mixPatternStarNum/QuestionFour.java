/*
 *  1
    2*3
    4*5*6
    7*8*9*10

 */
package assingment37.mixPatternStarNum;

import java.util.Scanner;

public class QuestionFour {

	public void FourthCode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n = sc.nextInt();
		System.out.println("--------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				if(j<i)
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
		QuestionFour q = new QuestionFour();
		q.FourthCode();
	}

}
