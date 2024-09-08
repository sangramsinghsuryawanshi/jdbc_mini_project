package assignment52.StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckGreaterThanCertainValue 
{
	public static String isGreater(List<Integer> li,int c)
	{
		return li.stream().allMatch(i->i>c)+"";
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(2, 4, 3, 8, 9, 6, 5));
		System.out.println("Given list is: "+li);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given element: ");
		int c = sc.nextInt();
		if(isGreater(li, c) != null)
		{
			System.out.println("Are all elements are greater than "+c+" "+isGreater(li, c));
		}
	}

}

