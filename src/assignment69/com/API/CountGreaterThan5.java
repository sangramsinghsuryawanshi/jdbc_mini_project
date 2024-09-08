package assignment69.com.API;

import java.util.Arrays;
import java.util.List;

public class CountGreaterThan5 
{
	public static void isFilterStringLen(List<String> li)
	{
		long l = li.stream().filter(i->i.length()>5).count();
		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		List<String> li = Arrays.asList("java","happy","length","app");
		isFilterStringLen(li);
	}
}