package assignment39.string.com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class ReturnOccuOfWord 
{
	public static HashMap<String, Integer> isReturnWord(String str)
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String s1[]=str.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(hm.containsKey(s1[i]))
			{
				hm.put(s1[i], hm.get(s1[i])+1);
			}
			else
			{
				hm.put(s1[i], 1);
			}
		}
		return hm;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("-----------------------------------------");
		System.out.println("Word_Count\tWord");
		System.out.println("-----------------------------------------");
		for(Entry<String, Integer> ent : isReturnWord(str).entrySet())
		{
			System.out.println(ent.getValue()+"\t\t"+ent.getKey());
		}
	}

}
