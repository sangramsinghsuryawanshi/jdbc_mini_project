package assignment64.mix;

public class FibonaciiSeries {
	public static void isFib(int n) {
		int a=0,b=1,c=0;
		for(int i=1;i<=10;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		int n=10;
		isFib(n);

	}

}
