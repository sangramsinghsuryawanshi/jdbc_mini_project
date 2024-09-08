/*
 * 4. Write a Java program to search for a value in a Tree Map.
 */
package assignment51.TreeMap.com;

import java.util.Scanner;
import java.util.TreeMap;

public class SearchValue 
{
	public static String isKey(TreeMap<Integer, String> tMap,String k)
	{
		if(tMap.containsValue(k))
		{
			return"The "+k+" value is present";
		}
		else
		{
			return"The "+k+" value is not present";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(23, "Red");
		tMap.put(60, "Yellow");
		tMap.put(90, "Black");
		tMap.put(11, "White");
		tMap.put(78, "Orange");
		System.out.println("Given Map is: "+tMap);
		System.out.println("Enter given value: ");
		String k = sc.next();
		System.out.println(isKey(tMap,k));
	}
}
