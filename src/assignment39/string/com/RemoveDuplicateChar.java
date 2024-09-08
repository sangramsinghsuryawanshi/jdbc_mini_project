/*
 * 10. Write a program that takes in a string and removes all consecutive duplicates (leaves
only one instance of each character).

 */
package assignment39.string.com;

import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 StringBuilder s = new StringBuilder(sc.nextLine());
		 StringBuilder te=null;
		 for(int i=0;i<s.length();i++)
		 {
			 for(int j=i+1;j<s.length();j++)
			 {
				 if(s.charAt(i)==s.charAt(j))
				 {
					 te=s.deleteCharAt(i);
				 }
			 }
		 }
		 for(int i=0;i<te.length();i++)
		 {
			 System.out.print(te.charAt(i));
		 }
	}

}
