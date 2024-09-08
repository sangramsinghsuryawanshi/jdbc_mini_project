/*
 * Q8 Keypad typing (Microsoft)
Input:
S = geeksforgeeks
Output: 4335736743357
Explanation:geeksforgeeks is 4335736743357
in decimal when we type it using the given
keypad.
 */
package assignment35.string.com;

import java.util.Scanner;

public class KeypadTyping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string : ");
		String s = sc.nextLine();
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='c')
			{
				System.out.print("2");
			}
			else if(s.charAt(i)>='d' && s.charAt(i)<='f')
			{
				System.out.print("3");
			}
			else if(s.charAt(i)>='g' && s.charAt(i)<='i')
			{
				System.out.print("4");
			}
			else if(s.charAt(i)>='j' && s.charAt(i)<='l')
			{
				System.out.print("5");
			}
			else if(s.charAt(i)>='m' && s.charAt(i)<='o')
			{
				System.out.print("6");
			}
			else if(s.charAt(i)>='p' && s.charAt(i)<='s')
			{
				System.out.print("7");
			}
			else if(s.charAt(i)>='t' && s.charAt(i)<='w')
			{
				System.out.print("8");
			}
			else if(s.charAt(i)>='x' && s.charAt(i)<='z')
			{
				System.out.print("9");
			}
		}
	}

}
