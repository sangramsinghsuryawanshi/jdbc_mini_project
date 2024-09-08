package assignment69.com.API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder 
{
	public static void isAscending(List<Integer> li)
	{
		List<Integer> l = li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8);
		isAscending(li);
	}
}
