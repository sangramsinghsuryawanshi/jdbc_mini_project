package assignment65.mixArrayAndString.com;

import java.util.ArrayList;
import java.util.Arrays;

interface PairSum {
	public int[][] isPair(int a[]);
}

public class PairOfSum {
	public static void main(String[] args) {
		PairSum ps = (a) -> {
			ArrayList<int[]> al = new ArrayList<int[]>();
			for (int i = 0; i < a.length; i++) {
				int sum = 0;
				for (int j = i + 1; j < a.length; j++) {
					sum = a[i] + a[j];
					if (sum == 4) {
						al.add(new int[] { a[i], a[j] });
					}
				}
			}
			int[][] re = new int[al.size()][2];
			for (int i = 0; i < al.size(); i++) {
				re[i] = (int[]) al.get(i);
			}
			return re;
		};
		int a1[] = { 2, 2, -2, 6, 7, 23, 64 };
		int c[][] = ps.isPair(a1);
		System.out.println("Pairs with sum " + 4 + ":");
		for (int[] pair : c) {
			System.out.println(Arrays.toString(pair));
		}
	}
}
