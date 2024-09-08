/*
 * Q18. Ordering of strings (walmart)
You will be given N number of strings. You have to find the lexicographically smallest string and
the lexicographically largest string among these strings.
Example 1:
Input:
N = 3
strings = a , ab , abc
Output: a abc
Explanation: Lexicographically smallest is
"a" and lexicographically largest is
"abc".

 */
package assignment35.string.com;

import java.util.Scanner;

public class OrderingOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		int cnt=0,max=0,min=Integer.MAX_VALUE;
		String str=null;
		String str1=null;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].length()>max)
			{
				max=s1[i].length();
				str=s1[i];
			}
			if(s1[i].length()<min)
			{
				min=s1[i].length();
				str1=s1[i];
			}
		}
		System.out.println("Max lenght: "+str);
		System.out.println("Min lenght: "+str1);
	}

}
