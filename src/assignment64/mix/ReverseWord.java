package assignment64.mix;

public class ReverseWord {
	public static void isReverseWord(String s) {
		String str[]=s.split(" ");
		String temp="";
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}
	public static void main(String[] args) {
		String str="java is simple";
		isReverseWord(str);
	}
}
