/*
 * ["flower", "flow", "flight"]

Output:
"fl"
 */
package assignment64.mix;

public class FindPrefixOfString {

	public static void isPrefix(String str) {
		String spl[] = str.split(" ");
		String prefix = spl[0];
		for (int i = 1; i < spl.length; i++) {
			while (!spl[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					System.out.println("No common prefix");
				}
			}
		}
		System.out.println(prefix);
	}

	public static void main(String[] args) {
		String str = "sa san sangr";
		isPrefix(str);
	}
}
