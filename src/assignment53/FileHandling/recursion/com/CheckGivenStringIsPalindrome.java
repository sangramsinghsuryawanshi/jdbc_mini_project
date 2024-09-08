/*
 * Q6.Create a recursive function to check the given String is palindrome or not.
 */
package assignment53.FileHandling.recursion.com;

import java.util.Scanner;

public class CheckGivenStringIsPalindrome 
{
	public static boolean isPal(String s)
	{
		if(s.length()<=1) 
		{
            return true;
        }
        if(s.charAt(0)!=s.charAt(s.length()-1)) 
        {
            return false;
        }
        return isPal(s.substring(1, s.length()-1));
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Given String: ");
		String b=sc.nextLine();
		if(isPal(b))
		{
			System.out.println(b+" is palindrome string");
		}
		else
		{
			System.out.println(b+" is not palindrome string");
		}
	}

}
