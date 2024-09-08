package assignment65.mixArrayAndString.com;
public class PermutationString 
{
	public static void isPeram(String str,String result) {
		if(str.length()==0) {
			System.out.println(result+" ");
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String news=str.substring(0, i)+str.substring(i+1);
			isPeram(news, result+ch);
		}
	}
	public static void main(String[] args) {
		isPeram("abc", "");
	}
}
