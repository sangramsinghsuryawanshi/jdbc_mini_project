package matrix.com;

import java.util.Scanner;

public class RotateMatrixClockWiseNintyDegree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter given matrix 1: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Clock wise matrix: ");
		for(int i=0;i<a.length;i++) {
			for(int j=a.length-1;j>=0;j--) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}
