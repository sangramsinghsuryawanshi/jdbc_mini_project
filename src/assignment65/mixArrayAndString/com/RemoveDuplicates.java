package assignment65.mixArrayAndString.com;

interface Duplicates{
	public int[] isRemoveDuplicate(int a[]);
}
public class RemoveDuplicates {
	public static void main(String[] args) {
		int a[]= {3,4,5,6,7,3,64};
		Duplicates sl = (arr)->{
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						arr[j]=0;
					}
				}
			}
			return arr;
		};
		System.out.println("Removed Duplicate element is: ");
		int c[]=sl.isRemoveDuplicate(a);
		for(int i=0;i<c.length;i++) {
			if(c[i]!=0) {
				System.out.print(c[i]+" ");
			}
		}
	}
}

