package assignment65.mixArrayAndString.com;

interface Missing {
	public int isMissing(int a[]);
}

public class FindMissingElement {
	public static void main(String[] args) {
		Missing m = (a) -> {
			int first = a[0];
			int last = a[a.length - 1];
			int s = a.length + 1;
			int opr1 = s * (first + last) / 2;
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			int opr2 = opr1 - sum;
			return opr2;
		};
		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9 };
		System.out.println("Missing element is: " + m.isMissing(a));
	}
}
