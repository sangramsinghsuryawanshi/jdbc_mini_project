package assignment65.mixArrayAndString.com;

public class ReplaceCharWithSpace {
	public static String isRemo(String str) {
		String s=str.replaceAll("s", " ");
		return s;
	}
	public static void main(String[] args) {
		System.out.println(isRemo("apsle"));
	}
}
