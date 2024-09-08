package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcateTwoList 
{
	public static String isConcat(List<String> li)
	{
		List<String> l = new ArrayList<String>(Arrays.asList("Apple","Pinaple","Orange","Banana"));
		System.out.println("Second list: "+l);
		return Stream.concat(l.stream(), li.stream()).toList()+"";
	}
	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<String>(Arrays.asList("java","c","c++","c#"));
		System.out.println("First list: "+li);
		System.out.println("Concatination of two list is:\n"+isConcat(li));
	}

}