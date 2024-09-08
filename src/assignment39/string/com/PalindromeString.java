/*
 * 3. Write a program that takes in a string and checks if it is a palindrome (reads the
same forwards and backwards).

 */
package assignment39.string.com;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 String s = sc.nextLine();
		 char ch[]=s.toCharArray();
		 char ch1[]=s.toCharArray();
		 int cnt=0;
		 for(int i=ch.length-1;i>=0;i--)
		 {
			ch1[cnt++]=ch[i];
		 }
		 String str=new String(ch1);
		 if(str.equals(s))
		 {
			 System.out.println("Given string is palindrome");
		 }
		 else
		 {
			 System.out.println("Given string is not palindrome");
		 }
	}
}
