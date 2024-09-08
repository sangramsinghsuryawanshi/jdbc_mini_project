package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenStream 
{
	public static String isEven(List<Integer> li)
	{
		return li.stream().filter(i->i%2==0).toList()+"";
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,4,3,8,9,6,5));
		System.out.println("Given list is: "+li);
		System.out.println("Given even list is: "+isEven(li));
	}

}

