/*
 * Q7. Print first letter of every word in the string (Zoho)
Input:
S = "geeks for geeks"
Output: gfg

 */
package assignment35.string.com;

import java.util.Scanner;

public class PrintFirstLetter 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string : ");
		String s = sc.nextLine();
		String s1[]=s.split(" ");
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			if(i==0)
			{
				System.out.println(ch[i]);
			}
			else if(ch[i]==' ')
			{
				System.out.println(ch[i+1]);
			}
		}
	}

}
