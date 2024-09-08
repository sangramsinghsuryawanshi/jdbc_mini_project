package assignment65.mixArrayAndString.com;

interface MaxSum {
	public int isMax(int ar[]);
}

public class ContiguousSubarraySum {
	public static void main(String[] args) {
		MaxSum ms = (a) -> {
			int max = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					int sum = 0;
					for (int k = i; k <= j; k++) {
						sum += a[k];
					}
					if (sum > max) {
						max = sum;
					}
				}
			}
			return max;
		};
		int a[] = { 1, -2, 3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Max sum of subarray: " + ms.isMax(a));
	}
}
