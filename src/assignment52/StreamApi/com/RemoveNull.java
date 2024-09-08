package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNull 
{
	public static String isNull(List<Integer> li)
	{
		return li.stream().filter(i->i!=0).toList()+"";
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(2,4,3,0,9,6,1));
		System.out.println("Given list is: "+li);
		System.out.println("Given removed null element is:\n"+isNull(li));
	}

}