package matrix.com;
import java.util.Scanner;
public class SortEleOfEcahRow {
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
		System.out.println("Sorted row is: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length-1;j++) {
				for(int k=j+1;k<a[i].length;k++) {
					if(a[i][j]>a[i][k]) {
						int temp=a[i][j];
						a[i][j]=a[i][k];
						a[i][k]=temp;
					}
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
