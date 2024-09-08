package assignment51.TreeMap.com;

import java.util.Scanner;
import java.util.TreeMap;

public class NavigableSet 
{
	public static String isKeys(TreeMap<Integer, String> tMap)
	{
		
		return tMap.navigableKeySet()+"";
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
		System.out.print("NavigableSet view of the keys:\n"+isKeys(tMap));
		
	}
}
