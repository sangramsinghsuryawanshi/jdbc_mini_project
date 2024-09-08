/*
 * 7. Write a program that takes in a string and converts all the uppercase letters to
lowercase.

 */
package assignment39.string.com;

import java.util.Scanner;

public class ConvertsToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 String s = sc.nextLine();
		 String s1=s.toLowerCase();
		 for(int i=0;i<s1.length();i++)
		 {
			 System.out.print(s1.charAt(i));
		 }
	}

}
