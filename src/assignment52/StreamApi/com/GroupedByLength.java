package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupedByLength 
{
	public static String isGroupLen(List<String> li)
	{
		return li.stream().collect(Collectors.groupingBy(String::length))+"";
	}
	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<String>(Arrays.asList("java","c","c++","c#"));
		System.out.println("Given list is: "+li);
		System.out.println("Given String list in Grouped by length:\n"+isGroupLen(li));
	}

}