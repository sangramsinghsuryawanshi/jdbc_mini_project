/*
 * Q12. Rearrange a string
Example 1:
Input: S = "AC2BEW3"
Output: "ABCEW5"
Explanation: 2 + 3 = 5 and we print all
alphabets in the lexicographical order.
Example 2:
Input: S = "ACCBA10D2EW30"
Output: "AABCCDEW6"
Explanation: 0+1+2+3 = 6 and we print
all alphabets in the lexicographical order.

 */
package assignment35.string.com;

import java.util.Arrays;
import java.util.Scanner;

public class ReArrangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		int sum=0,a=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				a=Character.getNumericValue(ch[i]);
				sum+=a;
			}
		}
		System.out.println("Rearrange a string is: ");
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				System.out.print(ch[i]+"");
			}
		}
		System.out.print(sum);
	}

}
