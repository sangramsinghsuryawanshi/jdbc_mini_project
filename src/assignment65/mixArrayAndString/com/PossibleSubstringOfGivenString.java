package assignment65.mixArrayAndString.com;

public class PossibleSubstringOfGivenString {
	public static String isSub(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				s+=str.substring(i, j+1)+" ";
			}
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(isSub("apple"));
	}
}
