package matrix.com;

import java.util.Arrays;
import java.util.Scanner;

public class FindMedianOfMatrix {

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
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		int n=row*col;
		int median=0;
		if(n%2!=0) {
			median=b[n/2];
		}else {
			median=b[((n/2)-1)+(n/2)/2];
			System.out.println(median+":");
		}
		System.out.println("Meadian of gievn matrix is: "+median);
	}

}
