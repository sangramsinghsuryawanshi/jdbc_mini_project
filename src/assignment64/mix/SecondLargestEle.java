package assignment64.mix;

public class SecondLargestEle {

	public static int issecLargest(int a[]) {
		int max = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				sMax = max;
				max = a[i];
			} else if (a[i] > sMax && a[i] != max) {
				sMax = a[i];
			}
		}
		return sMax;
	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 5, 23, 78, 45 };
		System.out.println("Second largest element is: " + issecLargest(a));

	}
}
