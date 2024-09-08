package assignment69.com.API;

import java.util.Arrays;
import java.util.List;

public class ConvertAllStringToUpercase {
	public static void isFilterString(List<String> li)
	{
		List<String> l = li.stream().map(a->a.toUpperCase()).toList();
		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		List<String> li = Arrays.asList("java is simple");
		isFilterString(li);
	}
}