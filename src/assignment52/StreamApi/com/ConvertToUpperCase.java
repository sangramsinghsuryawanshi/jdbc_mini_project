package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCase 
{
	public static String isUpperCase(List<String> li)
	{
		return li.stream().map(i->i.toUpperCase()).toList()+"";
	}
	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<String>(Arrays.asList("java","c","c++","c#"));
		System.out.println("Given list is: "+li);
		System.out.println("Given String list in upperCase is: "+isUpperCase(li));
	}

}