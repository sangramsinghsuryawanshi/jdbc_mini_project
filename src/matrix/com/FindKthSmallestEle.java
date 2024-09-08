package matrix.com;

import java.util.Scanner;

public class FindKthSmallestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[]=new int[row*col];
		int ind=0;
		System.out.println("Enter given matrix 1: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
				b[ind++]=a[i][j];
			}
		}
		System.out.println("Enter k element: ");
		int k=sc.nextInt();
		for(int j=0;j<b.length;j++) {
			if((j+1)==k) {
				System.out.println("Kth smallest element is: "+b[j]);
			}
		}
	}

}
