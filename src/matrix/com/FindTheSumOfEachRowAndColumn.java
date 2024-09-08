package matrix.com;
import java.util.Scanner;
public class FindTheSumOfEachRowAndColumn {

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
		System.out.println("Enter given row and coloumn sum is: ");
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"  ");
				sum+=a[i][j];
			}
			System.out.print("-->"+sum);
			System.out.println();
		}
		for(int i=0;i<a.length;i++) {
			int sum1=0;
			for(int j=0;j<a[i].length;j++) {
				sum1+=a[j][i];
			}
			System.out.print(sum1+" ");
		}
	}
}
