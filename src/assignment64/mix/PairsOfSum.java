package assignment64.mix;

public class PairsOfSum {
	public static void isSum(int a[]) {
		int k=4;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i+1;j<a.length;j++) {
				sum=a[i]+a[j];
				if(sum==k) {
					System.out.println(k+"="+a[i]+","+a[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,-4,5,6,8};
		isSum(a);
	}
}
