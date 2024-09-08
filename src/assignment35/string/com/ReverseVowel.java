/*
 * Q1. Reverse the vowels only (Flipkart)
S = "practice"
Output: prectica
Explanation: The vowels are a, i, e
Reverse of these is e, i, a.

 */
package assignment35.string.com;
import java.util.Scanner;
public class ReverseVowel 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		char c[]=new char[ch.length];
		int a=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') 
			{
				c[a]=ch[i];
				a++;
			}
		}
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') 
			{
				a--;
				ch[i]=c[a];
			}
		}
		String s1= new String(ch);
		System.out.println("Reverse of vowel is: "+s1);
	}

}
