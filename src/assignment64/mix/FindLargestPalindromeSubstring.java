/*
 * 2.Find the Largest Palindrome Substring:
Given a string, write a program to find the largest palindrome substring in it.

 */
package assignment64.mix;

public class FindLargestPalindromeSubstring {
	public static String isLongSubString(String str) {
		int max = Integer.MIN_VALUE;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String s = str.substring(i, j);
				int cnt = 1;
				for (int k = 0; k < s.length(); k++) {
					for (int l = k + 1; l < s.length(); l++) {
						if (s.charAt(k) == s.charAt(l)) {
							cnt++;
							break;
						}
					}
				}
				if (cnt == 1) {
					if (s.length() > max) {
						max = s.length();
						temp = s;
					}
				}
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		String str = "abcabcdabc";
		System.out.println("Longest Substring is: " + isLongSubString(str));

	}

}
