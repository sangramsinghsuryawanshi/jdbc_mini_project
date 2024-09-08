package matrix.com;
import java.util.Scanner;
public class SadlePoint {
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
		int ind=-1;
		for(int i=0;i<a.length;i++) {
			int max=0,min=Integer.MAX_VALUE;
			for(int k=0;k<a[i].length;k++) {
				if(a[i][k]<min) {
					min=a[i][k];
					ind=k;
				}
			}
			for(int j=0;j<a[i].length;j++) {
				if(a[i][ind]>max) {
					max=a[i][ind];
				}
			}
			if(min==max) {
				System.out.println("Sadle point");
				break;
			}else {
				System.out.println("Not");
			}
		}
	}
}
