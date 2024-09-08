package assignment50.NumPattern;
import java.util.Scanner;
public class PatternTwentyThirtyAscii 
{
	public static void isTwentyThirtyAscii(int n)
	{
		int c=65;
        for(int i=1;i<=n;i++)
        {
        	c=65;
            for(int j=i;j<=n;j++)
            {
            	System.out.print((char)c+++" ");
            }
            System.out.println();
        }
        int c1=65;
        for(int i=2;i<=n;i++)
        {
        	c1=65;
            for(int j=i;j>=1;j--)
            {
            	System.out.print((char)c1+++" ");
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
		PatternTwentyThirtyAscii.isTwentyThirtyAscii(n);
	}
}

