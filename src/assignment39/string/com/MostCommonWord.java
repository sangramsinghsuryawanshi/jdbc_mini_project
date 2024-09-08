package assignment39.string.com;

import java.util.Scanner;

public class MostCommonWord
{
	public static String isMostComomn(String s)
	{
		
		String []s1 = s.split(" ");
		int max=0;
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					cnt++;
				}
			}
			if(cnt>max)
			{
				max=cnt;
				s2=s1[i];
			}
		}
		return s2;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("-----------------------");
		System.out.println("Most common word is: "+isMostComomn(str));
	}

}

