package assignment65.mixArrayAndString.com;

import java.util.Arrays;

interface MaxMin{
	public String isMaxAndMin(int []a);
}
public class FindMaxAndMin {
	public static String isMaxAndMin() {
		MaxMin mm = (a)->{
			Arrays.sort(a);
			return a[0]+" < - Min || Max - > "+a[a.length-1];
		};
		int a[]= {12,45,67,4,8,9};
		return mm.isMaxAndMin(a);
		
	}
	public static void main(String[] args) {
		System.out.println(isMaxAndMin());
	}
}
