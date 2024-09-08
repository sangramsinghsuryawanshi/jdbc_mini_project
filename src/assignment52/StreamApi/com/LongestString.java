package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestString 
{
	public static String isLong(List<String> li)
	{
		return li.stream().max((a,b)->Integer.compare(a.length(), b.length()))+"";
	}
	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<String>(Arrays.asList("java","c","programming","c++","c#"));
		System.out.println("Given list is: "+li);
		System.out.println("Given longest String is:\n"+isLong(li));
	}

}
