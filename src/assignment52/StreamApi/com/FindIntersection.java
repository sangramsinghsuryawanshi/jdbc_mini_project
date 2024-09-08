package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindIntersection 
{
	public static String isInter(List<Integer> li,List<Integer> lil)
	{
		List let = new ArrayList(li);
		List let1 = new ArrayList(lil);
		return let.stream().filter(let1::contains).collect(Collectors.toList())+"";
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,4,3,8,9,6,5));
		 List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 6, 9, 11));
		System.out.println("Given list 1 is: "+li);
		System.out.println("Given list 2 is: "+list2);
		System.out.println("Given intersection element is: "+isInter(li,list2));
	}

}