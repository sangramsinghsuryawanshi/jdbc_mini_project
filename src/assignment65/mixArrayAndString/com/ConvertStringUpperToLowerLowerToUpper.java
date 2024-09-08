package assignment65.mixArrayAndString.com;
interface ViceVersa{
	public String isSatisfy(String str);
}
public class ConvertStringUpperToLowerLowerToUpper {
	public static void main(String[] args) {
		ViceVersa vv =(str)->{
			if(Character.isLowerCase(str.charAt(0))) {
				return str.toUpperCase();
			}else if (Character.isUpperCase(str.charAt(0))){
				return str.toLowerCase();
			}else {
				return str.toUpperCase();
			}
		};
		System.out.println(vv.isSatisfy("programming"));
	}
}
