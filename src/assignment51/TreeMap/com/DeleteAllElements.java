package assignment51.TreeMap.com;

import java.util.Scanner;
import java.util.TreeMap;
public class DeleteAllElements 
{
	public static TreeMap<Integer, String> isDelete(TreeMap<Integer, String> tMap)
	{
		tMap.clear();
		return tMap;
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
	
		System.out.print("\ndeleted all element: "+isDelete(tMap));
		
	}
}
