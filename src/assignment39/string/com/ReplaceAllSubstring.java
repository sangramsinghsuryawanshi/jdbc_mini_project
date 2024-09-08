/*
 * 8. Write a program that takes in a string and replaces all instances of a given substring
with another substring.

 */
package assignment39.string.com;

import java.util.Scanner;

public class ReplaceAllSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 String s = sc.nextLine();
		 System.out.println("Enter given word to replace with: ");
		 String s1 = sc.next();
		 System.out.println("Enter given word to replace: ");
		 String s2 = sc.next();
		 String temp=null;
		 for(int i=0;i<s.length();i++)
		 {
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					temp=s.replaceAll(s1, s2);
				}
			}
		 }
		 System.out.println("After replace all: ");
		 for(int i=0;i<temp.length();i++)
		 {
			 System.out.print(temp.charAt(i));
		 }
	}
}
