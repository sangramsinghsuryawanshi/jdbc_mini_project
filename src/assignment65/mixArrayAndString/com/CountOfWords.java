package assignment65.mixArrayAndString.com;
interface CountWord{
	public int isCount(String str);
}
public class CountOfWords {
	public static void main(String[] args) {
		CountWord cw = (str)->{
			String s[]=str.split(" ");
				return s.length;
		};
		System.out.println(cw.isCount("java is simple is language"));
	}
}
