package assignment65.mixArrayAndString.com;

interface Remove {
	public String isRemove(String str);
}

public class RemoveAllOccurenceOfChar {
	public static void main(String[] args) {
		Remove r = (str) -> {
			StringBuilder sc = new StringBuilder();
			for(char c: str.toCharArray()) {
				if(c!='c') {
					sc.append(c);
				}
			}
			return sc.toString();
		};
		System.out.println(r.isRemove("calculator"));
	}
}
