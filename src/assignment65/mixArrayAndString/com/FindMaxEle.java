package assignment65.mixArrayAndString.com;

public class FindMaxEle {
	public static int isMax(int a[]) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int a[]= {34,25,67,89,2,1};
		System.out.println("Max element is: " + isMax(a));
	}
}
