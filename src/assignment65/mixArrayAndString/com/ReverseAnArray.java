package assignment65.mixArrayAndString.com;

import java.util.Arrays;

public class ReverseAnArray {
	public static int[] isReverse(int a[]) {
		int b[]=new int[a.length];
		int cnt=0;
		for(int i=a.length-1;i>=0;i--) {
			b[cnt++]=a[i];
		}
		return b;
	}
	public static void main(String[] args) {
		int a[]= {343,25,647,849,2,11};
		System.out.println("Reverse element is: " + Arrays.toString(isReverse(a)));
	}
}

