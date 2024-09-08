package assignment69.com.API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FilterAllEvenNum 
{
	public static void isFilter(List<Integer> li)
	{
		Optional<Integer> l = li.stream()
                .distinct() 
                .sorted(Comparator.reverseOrder()) 
                .skip(1)
                .findFirst(); 

		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8);
		isFilter(li);
	}
}
