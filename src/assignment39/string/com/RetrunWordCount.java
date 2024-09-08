/*
 * 25. Write a program that takes in a string and returns the number of words in it.
 */
package assignment39.string.com;

import java.util.Scanner;

public class RetrunWordCount 
{
	public static int isCount(String s)
	{
		String s1[]=s.split(" ");
		int wordLe=s1.length;
		return wordLe;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("-----------------------");
		System.out.println("Given word count is: "+isCount(str));
	}

}
