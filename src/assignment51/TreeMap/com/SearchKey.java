/*
 * 3. Write a Java program to search for a 
 * key in a Tree Map.
 */
package assignment51.TreeMap.com;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
public class SearchKey 
{
	public static String isKey(TreeMap<Integer, String> tMap,int k)
	{
		String l =null;
		for(Entry<Integer, String> ent : tMap.entrySet())
		{
			if(ent.getKey()==k)
			l=ent.getValue();
		}
		return l;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given key: ");
		int k = sc.nextInt();
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(23, "Red");
		tMap.put(60, "Yellow");
		tMap.put(90, "Black");
		tMap.put(11, "White");
		tMap.put(78, "Orange");
		
		System.out.println("Given key and value is: "+isKey(tMap,k)+" "+k);
	}
}