/*
 * 1.Find the Missing Number:
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 */
package assignment64.mix;

public class FindMissingElement {
	public static int isMissing(int a[], int s) {
		int first = a[0];
		int last = a[a.length - 1];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		int req = s * (first + last) / 2;
		return req - sum;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int s = a.length + 1;
		System.out.println("Given missing element is: " + isMissing(a, s));
	}

}
