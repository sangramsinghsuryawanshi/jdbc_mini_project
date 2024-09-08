package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctElemets 
{
	public static String isDistinct(List<Integer> li)
	{
		return li.stream().distinct().toList()+"";
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(2,4,3,4,9,6,1));
		System.out.println("Given list is: "+li);
		System.out.println("Given remove distinct element is:\n"+isDistinct(li));
	}

}
