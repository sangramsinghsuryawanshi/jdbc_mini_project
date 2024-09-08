package assignment64.mix;

import java.util.Stack;

public class CheckBalncedParanthesis {
	public static boolean isBalnaced(char ch[]) {

		Stack<Character> st = new Stack<>();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
				st.push(ch[i]);
			} else {
				if (st.isEmpty()) {
					return false;
				} else {
					char top = (char) st.pop();
					if ((ch[i] == '}' && top != '{') || (ch[i] == ']' && top != '[') || (ch[i] == ')' && top != '(')) {
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		char ch[] = { '[', ']', '{', '}' };
		if (isBalnaced(ch)) {
			System.out.println("Balanced...");
		} else {
			System.out.println("Not Balanced...");
		}
	}

}
