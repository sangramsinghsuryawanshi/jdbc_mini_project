package matrix.com;
import java.util.Scanner;
public class DigonalOrNot {
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
				if(i==j && a[i][j]==0) {
					c++;
				}else if(i!=j && a[i][j]!=0) {
					c=1;
				}
			}
			if(c==0) {
				System.out.println("Given matrix is digonal: ");
				break;
			}else {
				System.out.println("Given matrix is not digonal: ");
				break;
			}
		}
	}
}
