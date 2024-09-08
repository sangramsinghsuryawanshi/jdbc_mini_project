package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfList 
{
	public static String isCount(List<Integer> li)
	{
		return li.stream().mapToInt(i->i).count()+"";
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,4,3,8,9,6,5));
		System.out.println("Given list is: "+li);
		System.out.println("Given count of list element is: "+isCount(li));
	}

}