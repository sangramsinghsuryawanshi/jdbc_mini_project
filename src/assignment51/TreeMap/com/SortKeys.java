package assignment51.TreeMap.com;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class SortKeys 
{
	public static TreeMap<Integer, String> isSort()
	{
		TreeMap<Integer, String> tMap = new TreeMap<>(Comparator.reverseOrder());
			tMap.put(23, "Red");
			tMap.put(60, "Yellow");
			tMap.put(90, "Black");
			tMap.put(11, "White");
			tMap.put(78, "Orange");
			return tMap;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Keys\tValues: ");
		for(Entry<Integer, String> ent: isSort().entrySet())
		{
			System.out.println(ent.getKey()+"\t"+ent.getValue());
		}
		
	}
}

