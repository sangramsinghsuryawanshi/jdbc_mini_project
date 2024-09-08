/*
 * 20. Write a program that takes in a string and checks if it is a valid credit card number
 */
package assignment39.string.com;
import java.util.Scanner;
public class CheckValidCreaditCardNum 
{
	public String isValid(String s)
	{
		char ch[]=s.toCharArray();
		int cnt=0,w=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ' && Character.isDigit(ch[i]))
			{
				cnt++;
			}
			else if(ch[i]!=' ')
			{
				w++;
			}
		}
		if(cnt>0 && w<=0)
		{
			return" Vaild credit card number";
		}
		else
		{
			return"Not vaild credit card number";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		CheckValidCreaditCardNum c = new CheckValidCreaditCardNum();
		String s=c.isValid(str);
		System.out.println(s);
	}
}
