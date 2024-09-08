/*
 * Q21. Last Match
Given two strings A and B, you need to find the last occurrence ( 1 based indexing) of string B in
string A.
Example 1:
Input:
A = abcdefghijklghifghsd
B = ghi
Output:
13
Explanation:
ghi occurs at position 13 for the
last time in string A.

 */
package assignment35.string.com;

import java.util.Scanner;

public class LastMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s=sc.nextLine();
		System.out.println("Enter the string 2: ");
		String s1=sc.nextLine();
		int n=s.lastIndexOf(s1);
		System.out.println("Position of String b is: "+(n+1));
	}

}
