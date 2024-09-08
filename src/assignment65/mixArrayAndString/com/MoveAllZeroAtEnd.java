package assignment65.mixArrayAndString.com;

import java.util.Arrays;

public class MoveAllZeroAtEnd {
	public static int[] isMoved(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,0,0,0,5,6};
		System.out.println("Given element is: "+Arrays.toString(isMoved(a)));
	}

}
