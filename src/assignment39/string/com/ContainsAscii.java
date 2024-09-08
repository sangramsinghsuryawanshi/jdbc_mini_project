/*
 * 24. Write a program that takes in a string and checks if it 
 * contains only ASCII characters.
 */
package assignment39.string.com;

import java.util.Scanner;

public class ContainsAscii 
{
	public static void isAscii(String s)
	{
		try 
		{
			String c="";
			String str="";
           for(int i=0;i<s.length();i++)
           {
        	   if(Character.isDigit(s.charAt(i)))
        	   {
        		   c+=s.charAt(i)+"";
        	   }
        	   if(Character.isAlphabetic(s.charAt(i)))
        	   {
        		   str+=s.charAt(i);
        	   }
           }
           int ascii = Integer.parseInt(c);
           System.out.println("Given contains ascii characters:\n String-> "+str+"\nAscii char-> "+(char)ascii+"\nInt value-> "+ascii);
		}
		catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("-----------------------");
		isAscii(str);
	}
}
