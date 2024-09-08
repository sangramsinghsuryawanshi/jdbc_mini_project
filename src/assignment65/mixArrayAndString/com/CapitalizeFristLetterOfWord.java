package assignment65.mixArrayAndString.com;
interface Capital{
	public String isCapital(String str);
}
public class CapitalizeFristLetterOfWord {
	public static void main(String[] args) {
		Capital c = (str)->{
			String s[]=str.split(" ");
			String s1="";
			for(int i=0;i<s.length;i++) {
				s1+=Character.toUpperCase(s[i].charAt(0))+s[i].substring(1)+" ";
			}
			return s1;
		};
		System.out.println(c.isCapital("java is simple"));
	}
}
