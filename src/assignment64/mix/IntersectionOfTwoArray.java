package assignment64.mix;

import java.util.Arrays;

public class IntersectionOfTwoArray {

	public static void isIntersection(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i] + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 35, 78 };
		int b[] = { 1, 4, 2, 5, 8 };
		Arrays.sort(a);
		Arrays.sort(b);
		isIntersection(a, b);
	}
}
