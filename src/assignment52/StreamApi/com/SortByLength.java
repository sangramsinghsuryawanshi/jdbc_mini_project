package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByLength 
{
	public static String isSort(List<String> li)
	{
		return li.stream().sorted((a,b)->b.length()-a.length()).toList()+"";
	}
	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<String>(Arrays.asList("java","Ruby","pythan","c#"));
		System.out.println("Given list is: "+li);
		System.out.println("Given Sort by length:\n"+isSort(li));
	}

}