package assignment69.com.API;

import java.util.Arrays;
import java.util.List;

public class AllSquares 
{
	public static void isSq(List<Integer> li)
	{
		List<Integer> l = li.stream().map(i->i*i).toList();
		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8);
		isSq(li);
	}
}
