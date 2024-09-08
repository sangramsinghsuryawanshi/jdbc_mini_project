/*
 * 21. Write a Java program to get the portion of a map whose keys range 
 * from a given key (inclusive) to another key (exclusive).
 */
package assignment51.TreeMap.com;

import java.util.Scanner;
import java.util.TreeMap;

public class PortionLessThanKey 
{
	public static String isPortion(TreeMap<Integer, String> tMap,int k,int k1)
	{
		return tMap.subMap(k, true, k1, true)+"";
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
		System.out.println("Enter first key: ");
		int k = sc.nextInt();
		System.out.println("Enter last key: ");
		int k1 = sc.nextInt();
		System.out.print("keys range from fromKey to toKey:\n"+isPortion(tMap,k,k1));
	}
}
