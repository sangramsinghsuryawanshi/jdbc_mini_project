package assignment65.mixArrayAndString.com;

interface Majority{
	public int isMajor(int a[]);
}
public class MajorityElement {
	public static void main(String[] args) {
		Majority mj = (a)->{
			int max=Integer.MIN_VALUE;
			int temp=0;
			for(int i=0;i<a.length;i++) {
				int cnt=0;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						cnt++;
						a[j]=0;
					}
				}
				if(cnt>max && a[i]!=0) {
					max=cnt;
					temp=a[i];
				}
			}
			return temp;
		};
		int a[]= {1,1,2,2,2,1,1,3,3,3,3,3};
		System.out.println("Majority Element is: "+mj.isMajor(a));
	}
}
