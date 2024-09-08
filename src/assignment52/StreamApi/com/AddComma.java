package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddComma 
{
	public static String isComma(List<Integer> li)
	{
		return li.stream().map(String::valueOf).collect(Collectors.joining(","));
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(2,4,3,1,9,6,1));
		System.out.println("Given list is: "+li);
		System.out.println("Given comma is:\n"+isComma(li));
	}

}
