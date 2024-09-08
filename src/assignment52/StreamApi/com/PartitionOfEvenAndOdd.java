package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionOfEvenAndOdd 
{
	public static String isEvenAndOdd(List<Integer> li)
	{
		return li.stream().collect(Collectors.partitioningBy(i->i%2==0))+"";
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,4,3,8,9,6,5));
		System.out.println("Given list is: "+li);
		System.out.println("Given even and odd list is:\n"+isEvenAndOdd(li));
	}

}