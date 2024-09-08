/*
 * Q5. Uncommon characters (Zoho)
Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation:
The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
are either present in A or B, but not in both.

 */
package assignment35.string.com;

import java.util.Scanner;

public class UncoomonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string 1: ");
		String s = sc.nextLine();
		System.out.println("Enter given string 2: ");
		String s1 = sc.nextLine();
		String str=s.concat(s1);
		System.out.println(str);
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
