package assignment52.StreamApi.com;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfSqOfEvenNum 
{
	public static String isSumEvenSq(List<Integer> li)
	{
		return IntStream.range(1, 100).filter(i->i%2==0).map(i->i).sum()+"";
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,4,3,8,9,6,5));
		System.out.println("Given list is: "+li);
		System.out.println("Given sum of even square all element is:\n"+isSumEvenSq(li));
	}

}

