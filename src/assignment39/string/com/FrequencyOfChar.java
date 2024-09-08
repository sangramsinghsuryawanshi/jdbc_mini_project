/*
 * 29. Write a program that takes in a string and returns the number of times each character
appears in it.

 */
package assignment39.string.com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequencyOfChar 
{
	public static HashMap<Character, Integer> isFre(String s)
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		return hm;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("-----------------------");
		System.out.println("Character\tNumber");
		for(Entry<Character, Integer> ent:isFre(str).entrySet())
		{
			System.out.println(ent.getKey()+"\t\t"+ent.getValue());
		}
	}
}

