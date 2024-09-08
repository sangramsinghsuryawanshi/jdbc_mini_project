package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAverageOfAllElemets 
{
	public static String isAvg(List<Integer> li)
	{
		return li.stream().mapToDouble(i->i).average()+"";
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,4,3,8,9,6,5));
		System.out.println("Given list is: "+li);
		System.out.println("Given average of list is:\n"+isAvg(li));
	}

}
