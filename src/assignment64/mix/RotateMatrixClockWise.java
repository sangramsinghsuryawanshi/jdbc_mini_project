package assignment64.mix;

public class RotateMatrixClockWise {
	public static void rotateClockWise(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = a[i].length - 1; j >= 0; j--) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotateClockWise(a);
	}

}
