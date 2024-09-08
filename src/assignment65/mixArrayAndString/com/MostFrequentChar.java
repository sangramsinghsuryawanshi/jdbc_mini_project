package assignment65.mixArrayAndString.com;

public class MostFrequentChar {
	public static void isFre(String str) {
		int max=0;
		char c='0';
		for(int i=0;i<str.length();i++) {
			int cnt=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					cnt++;
				}
			}
			if(cnt>max && str.charAt(i)!=' ') {
				max=cnt;
				c=str.charAt(i);
			}
		}
		System.out.println(c+" "+max);
	}
	public static void main(String[] args) {
		isFre("apple");
	}
}
