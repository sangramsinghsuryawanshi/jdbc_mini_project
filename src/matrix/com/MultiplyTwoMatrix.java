/*
 * 2. Write a Java program to multiply two matrices.
 */
package matrix.com;

import java.util.Scanner;

public class MultiplyTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int sum=0;
		System.out.println("Enter given matrix 1: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter given matrix 2: ");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				a[i][j]=a[i][j]*b[i][j];
			}
		}
		System.out.println("Given Multiplication of matrix is: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
