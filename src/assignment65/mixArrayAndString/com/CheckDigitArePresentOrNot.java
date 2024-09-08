package assignment65.mixArrayAndString.com;
interface Digit{
	public boolean isPresent(String str);
}
public class CheckDigitArePresentOrNot {
	public static void main(String[] args) {
		Digit d = (str)->{
			for(int i=0;i<str.length();i++) {
				if(Character.isDigit(str.charAt(i))) {
					return true;
				}
			}
			return false;
		};
		System.out.println(d.isPresent("sangram34"));
	}
	
}
