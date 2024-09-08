package assignment64.mix;

import java.util.Arrays;

public class CheckAnagram {
	public static String isAnagram(String s1, String s2) {
		char[] ch = s1.toCharArray();
		char[] ch1 = s2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		String chs = new String(ch);
		String chs1 = new String(ch1);
		if (chs.equalsIgnoreCase(chs1)) {
			return "String is anagram";
		} else {
			return "String is not anagram";
		}
	}

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		System.out.println(isAnagram(s1, s2));
	}
}
