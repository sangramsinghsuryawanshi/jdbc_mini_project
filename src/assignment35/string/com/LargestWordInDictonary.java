/*
 * Q15. Find largest word in dictionary (MicroSoft)
Example 1:
Input: d = {"ale", "apple", "monkey", "plea"}
S = "abpcplea"
Output: "apple"
Explanation: After deleting "b", "c"
"a" S became "apple" which is present
in d.

 */
package assignment35.string.com;

import java.util.Scanner;

public class LargestWordInDictonary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str[] = {"ale", "apple", "monkey", "plea"};
		String s= sc.nextLine();
		int max=0;
		String main=null;
		for(int i=0;i<str.length;i++)
		{
			char ch[]=str[i].toCharArray();
			char ch1[]=str[i].toCharArray();
			int cnt=0;
			for(int k=0;k<ch.length;k++)
			{
				for(int j=0;j<s.length();j++)
				{
					if(ch[k]==s.charAt(j))
					{
						cnt++;
						break;
					}
				}
				if(cnt>max)
				{
					main = new String(ch1);
					max=cnt;
				}
			}
		}
		System.out.println(main);
	}

}
