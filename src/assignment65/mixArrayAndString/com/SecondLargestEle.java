package assignment65.mixArrayAndString.com;

import java.util.Arrays;
import java.util.Collections;

interface SecondLarge{
	public int isSMax(Integer arr[]);
}
public class SecondLargestEle {
	public static void main(String[] args) {
		Integer a[]= {3,4,5,6,7,23,64};
		SecondLarge sl = (arr)->{
			Arrays.sort(arr, Collections.reverseOrder());
			int sum=arr[1];
			return sum;
		};
		System.out.println("Second Largest element is: "+sl.isSMax(a));
	}
}

