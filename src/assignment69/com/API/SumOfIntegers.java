package assignment69.com.API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfIntegers 
{
	public static void isFilterSum(List<Integer> li)
	{
		List<Integer> l = li.stream().distinct().collect(Collectors.toList());
		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		List<Integer> li = Arrays.asList(1,2,3,2,3,4,5,6,7,8);
		isFilterSum(li);
	}
}

