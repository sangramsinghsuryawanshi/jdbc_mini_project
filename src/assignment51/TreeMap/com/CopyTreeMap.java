/*
 * 2. Write a Java program to copy Tree Map's content to another Tree Map.
 */
package assignment51.TreeMap.com;

import java.util.Scanner;
import java.util.TreeMap;

public class CopyTreeMap 
{
	public static TreeMap<Integer, String> isCopy(TreeMap<Integer, String> tMap)
	{
		TreeMap<Integer, String> tMap1 = new TreeMap<Integer, String>(tMap);
		return tMap1;
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
		
		System.out.println("Copy Tree Map's: "+isCopy(tMap));
	}
}