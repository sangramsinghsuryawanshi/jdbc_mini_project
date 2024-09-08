/*
 * 5. Write a Java program to get all keys from a Tree Map.
 */
package assignment51.TreeMap.com;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class GetAllKeys 
{
	public static int[] isDemo(TreeMap<Integer, String> tMap)
	{
		int l[] =new int[tMap.size()];
		int c=0;
		for(Entry<Integer, String> ent : tMap.entrySet())
		{
			l[c++]=ent.getKey();
		}
		return l;
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
		System.out.println("Given Map is: "+tMap);
		System.out.print("\nGiven all key is: ");
		for(int i=0;i<isDemo(tMap).length;i++)
		{
			System.out.print(isDemo(tMap)[i]+" ");
		}
	}
}