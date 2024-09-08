package assignment65.mixArrayAndString.com;
import java.util.ArrayList;
import java.util.Arrays;
interface Intersection {
	public int[] isMissing(int a[], int b[]);
}
public class FindIntersection {
	public static void main(String[] args) {
		int a1[] = { 3, 4, 5, 6, 7, 23, 64 };
		int a2[] = { 3, 4, 53, 64, 75, 23, 6 };
		Intersection se = (a, b) -> {

			ArrayList<Integer> al = new ArrayList<>();
			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[j]) {
						al.add(a[i]);
					}
				}
			}
			int x = 0;
			int re[] = new int[al.size()];
			for (int s : al) {
				re[x++] = s;
			}
			return re;
		};
		System.out.println("Intersection of Two element: " + Arrays.toString(se.isMissing(a1, a2)));
	}
}
