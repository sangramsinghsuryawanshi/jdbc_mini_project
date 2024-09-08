/*
 * 1. Write a program that takes in a string and reverses it.
 */
package assignment39.string.com;

import java.util.Scanner;

public class StringReverse 
{
	 public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 String s = sc.nextLine();
		 System.out.println("Given reverse string is: ");
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 System.out.print(s.charAt(i));
		 }
	 }
}
