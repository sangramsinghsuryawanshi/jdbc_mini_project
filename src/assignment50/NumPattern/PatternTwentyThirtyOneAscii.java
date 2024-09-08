package assignment50.NumPattern;
import java.util.Scanner;
public class PatternTwentyThirtyOneAscii 
{
	public static void isTwentyThirtyOneAscii(int n)
	{
        for(int i=1;i<=n;i++)
        {
        	int c=70-i;
            for(int j=n;j>=i;j--)
            {
            	System.out.print((char)c+" ");
            	c--;
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
        	  int c1=64+i;
            for(int j=1;j<=i;j++)
            {
            	System.out.print((char)c1+" ");
            	c1--;
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
		PatternTwentyThirtyOneAscii.isTwentyThirtyOneAscii(n);
	}
}


