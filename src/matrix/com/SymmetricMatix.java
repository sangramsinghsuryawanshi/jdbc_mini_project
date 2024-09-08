/*
 * 4. Write a Java program to check if a matrix is symmetric.
 */
package matrix.com;
import java.util.Scanner;
public class SymmetricMatix {
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
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]!=a[j][i]) {
					c++;
					break;
				}
			}
			if(c==0) {
				System.out.println("Symmetric");
				break;
			}else {
				System.out.println("Not sysmmetic");
				break;
			}
		}
	}
}
