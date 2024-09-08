/*
 * Q14. Special array reversal (google)
Example 1:
Input: S = "A&B"
Output: "B&A"
Explanation: As we ignore '&' and
then reverse, so answer is "B&A".
Example 2:
Input: S = "A&x#
Output: "x&A#"
Explanation: we swap only A and x.

 */
package assignment35.string.com;

import java.util.Scanner;

public class ArrayReversal 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		char ch[]=str.toCharArray();
		char c[]=new char[ch.length];
		int a=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				c[a++]=ch[i];
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				a--;
				ch[i]=c[a];
			}
		}
		String s= new String(ch);
		System.out.println(s);
	}

}
