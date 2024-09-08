package assignment65.mixArrayAndString.com;

import java.util.Arrays;

interface Merge{
	public int[] isMerged(int a[],int b[]);
}
public class MergeTwoArray {
	public static void main(String[] args) {
		int a1[]= {3,4,5,6,7,23,64};
		int a2[]= {3,41,53,64,75,23,6};
		Merge se = (a,b)->{
			int c[]=new int[a.length+b.length];
			int x=0;
			for(int i=0;i<a.length;i++) {
				c[x++]=a[i];
			}
			for(int i=0;i<b.length;i++) {
				c[x++]=b[i];
			}
			Arrays.sort(c);
			return c;
		};
		System.out.println("Merged Two element: "+Arrays.toString(se.isMerged(a1, a2)));
	}
}
