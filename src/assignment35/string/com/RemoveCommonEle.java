/*
 * Q6. Remove common characters and concatenate (Oracle)
Input:
s1 = aacdb
s2 = gafd
Output: cbgf
Explanation: The common characters of s1
and s2 are: a, d. The uncommon characters
of s1 and s2 are c, b, g and f. Thus the
modified string with uncommon characters
concatenated is cbgf.

 */
package assignment35.string.com;

import java.util.Scanner;

public class RemoveCommonEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string 1: ");
		String s = sc.nextLine();
		System.out.println("Enter given string 2: ");
		String s1 = sc.nextLine();
		String str=s.concat(s1);
		for(int i=0;i<str.length();i++)
		{
			int cnt=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==1)
			{
				System.out.println(str.charAt(i));
			}
		}
	}

}
