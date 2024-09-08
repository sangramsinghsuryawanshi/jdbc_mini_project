package assignment64.mix;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static int[] isMerge(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			c[x++] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[x++] = b[i];
		}
		Arrays.sort(c);
		return c;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 35, 78 };
		int b[] = { 3, 4, 7, 5, 8 };
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(isMerge(a, b)));
	}
}
