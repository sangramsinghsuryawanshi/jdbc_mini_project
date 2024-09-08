package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequent 
{
	public static String isMostFrequent(List<String> li)
	{
		return li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey)+"";
	}
	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<String>(Arrays.asList("java","c","c","c++","c#"));
		System.out.println("Given list is: "+li);
		System.out.println("Given Most Frequent element is:\n"+isMostFrequent(li));
	}

}