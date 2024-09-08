package assignment50.NumPattern;

import java.util.Scanner;

public class PatternThirty
{
	public static void isThirty(int n)
	{
		int num = 1,n1=10,n2=20,n3=21,n4=11;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
            	if(j==1)
            	{
            		System.out.print(num+++" ");
            	} 
            	else if(j==2)
            	{
            		System.out.print(n1--+" ");
            	}
            	else if(j==3)
            	{
            		System.out.print(n4+++" ");
            	}
            	else if(j==4)
            	{
            		System.out.print(n2--+" ");
            	}
            	else if(j==5)
            	{
            		System.out.print(n3+++" ");
            	}
            	else
            	{
            		System.out.print(" ");
            	}
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
		PatternThirty.isThirty(n);
	}

}