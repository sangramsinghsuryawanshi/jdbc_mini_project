package assignment64.mix;
public class CountOfChar {
	public static void isFre(String s) {
		char str[] = s.toCharArray();
		for (int i = 0; i < str.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					temp++;
					str[j] = '0';
				}
			}
			if (str[i] != ' ' && str[i] != '0') {
				System.out.println(str[i] + " " + temp);
			}
		}
	}
	public static void main(String[] args) {
		String str = "java is simple";
		isFre(str);
	}
}
