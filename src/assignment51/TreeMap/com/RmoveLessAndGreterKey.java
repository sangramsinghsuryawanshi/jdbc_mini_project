/*
 * 19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.

20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.

 */
package assignment51.TreeMap.com;

import java.util.Scanner;
import java.util.TreeMap;

public class RmoveLessAndGreterKey 
{
	public static String isKeys(TreeMap<Integer, String> tMap)
	{
		
		return tMap.pollLastEntry()+"";
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(23, "Red");
		tMap.put(60, "Yellow");
		tMap.put(90, "Black");
		tMap.put(11, "White");
		tMap.put(78, "Orange");
		System.out.println("Given Map is: \n"+tMap);
		System.out.println("greatest key in a map:\n"+isKeys(tMap));
		System.out.println("After remove key: \n"+tMap);
		
	}
}
