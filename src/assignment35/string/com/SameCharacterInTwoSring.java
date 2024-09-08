/*
 * Q19. Same characters in two strings
Given two strings A and B of equal length, find how many times the corresponding position in
the two strings hold exactly the same character. The comparison should not be case sensitive.
Example 1:
Input:
A = choice
B = chancE
Output: 4
Explanation: characters at position 0, 1, 4 and 5
are the same in the two strings A and B.
 */
package assignment35.string.com;

import java.util.Scanner;

public class SameCharacterInTwoSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s=sc.nextLine();
		s=s.toLowerCase();
		System.out.println("Enter the string 2: ");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==s1.charAt(i))
			{
				cnt++;
			}
		}
		System.out.println("Same character is: "+cnt);
	}

}
