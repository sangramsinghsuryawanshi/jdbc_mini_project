package assignment39.string.com;

import java.util.Scanner;

public class ReturnSecondMostFrequentChar 
{
	public String isSndFreq(String str)
	{
		char ch[]=str.toCharArray();
		int max=0,smax=0;
		char ch1='\0',ch2='\0';
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0' && c>max)
			{
				smax=max;
				ch2=ch1;
				max=c;
				ch1=ch[i];
			}
			else if(ch[i]!='\0' && c>smax && max!=smax)
			{
				smax=c;
				ch2=ch[i];
			}
		}
		String str1 = Character.toString(ch2);
		return str1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		ReturnSecondMostFrequentChar u = new ReturnSecondMostFrequentChar();
		String s=u.isSndFreq(str);
		System.out.println("Second most frequent character is: "+s);
	}

}
