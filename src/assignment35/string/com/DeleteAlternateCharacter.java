/*
 * Q2. Delete alternate characters (Amazon)
Input: S = "Geeks"
Output: "Ges"
Explanation: Deleted "e" at index 1
and "k" at index 3.

 */
package assignment35.string.com;

import java.util.Scanner;

public class DeleteAlternateCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		StringBuffer str = new StringBuffer(sc.nextLine());
		for(int i=1;i<str.length();i+=2)
		{
			str.deleteCharAt(i);
			i--;
		}
		System.out.println("Given string is: "+str);
	}

}
