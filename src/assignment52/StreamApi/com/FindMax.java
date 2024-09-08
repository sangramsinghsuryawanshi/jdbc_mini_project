package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMax 
{
	public static String isMax(List<Integer> li)
	{
		return li.stream().mapToInt(i->i).max()+"";
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,4,3,8,9,6,5));
		System.out.println("Given list is: "+li);
		System.out.println("Given Max of list element is: "+isMax(li));
	}

}