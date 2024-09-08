package assignment64.mix;

public class SumOfNInteger {
	public static int isSum(int n) {
		int rem = 0, sum = 0;
		int temp = n;
		while (temp != 0) {
			rem = temp % 10;
			sum += rem;
			temp = temp / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = 973489;
		System.out.println("Sum is: " + isSum(n));
	}
}
