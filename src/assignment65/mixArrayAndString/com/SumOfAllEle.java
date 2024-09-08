package assignment65.mixArrayAndString.com;

interface SumEle {
	public int isSum(int arr[]);
}

public class SumOfAllEle {
	public static void main(String[] args) {
		int a[]= {3,4,5,6,7,23,64};
		SumEle se = (arr)->{
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			return sum;
		};
		System.out.println("Sum of element is: "+se.isSum(a));
	}
}
