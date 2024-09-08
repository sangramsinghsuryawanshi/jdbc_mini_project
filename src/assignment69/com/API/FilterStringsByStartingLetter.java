package assignment69.com.API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterStringsByStartingLetter 
{
	public static void isFilterStringLet(List<String> li)
	{
		Map<Integer, List<String>> l = li.stream()
                .collect(Collectors.groupingBy(String::length));

		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		List<String> li = Arrays.asList("apple", "banana", "cherry", "date", "egg", "fig", "grape");
		isFilterStringLet(li);
	}
}