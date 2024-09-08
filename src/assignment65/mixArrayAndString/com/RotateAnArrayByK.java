package assignment65.mixArrayAndString.com;

import java.util.Arrays;
interface Rotated{
	public int[] isRotate(int a[],int k);
}
public class RotateAnArrayByK {
	public static void main(String[] args) {
		int a[]= {343,25,647,849,2,11};
		Rotated ro = (arr,k)->{
			for(int i=1;i<=k;i++) {
				int temp=arr[arr.length-1];
				for(int j=arr.length-1;j>0;j--) {
					arr[j]=arr[j-1];
				}
				arr[0]=temp;
			}
			return arr;
			
		};
		System.out.println(Arrays.toString(ro.isRotate(a, 2)));
	}
}