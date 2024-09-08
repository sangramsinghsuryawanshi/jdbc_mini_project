package assignment39.string.com;

import java.util.Scanner;

public class FirstReccursingChar 
{
	public static char isFirst(String s)
	{
		int ind=-1;
		char indChar='\0';
		char ca[]=s.toCharArray();
		for(int i=0;i<ca.length;i++)
		{
			for(int j=i+1;j<ca.length;j++)
			{
				if(ca[i]==ca[j])
				{
					if(ind==-1)
					{
						ind=i;
						indChar=ca[i];
					}
				}
			}
		}
		return indChar;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("Given charater is: "+isFirst(str));
	}

}
