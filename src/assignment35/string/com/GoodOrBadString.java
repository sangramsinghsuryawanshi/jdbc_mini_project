/*
 * Q10. Good or Bad string (Amazon)
Input:
S = aeioup??
Output:
1
Explanation: The String doesn't contain more than
3 consonants or more than 5 vowels together. So,
it's a GOOD string.

 */
package assignment35.string.com;

import java.util.Scanner;

public class GoodOrBadString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		char ch[]=str.toCharArray();
		int cnt=0,cnt1=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				cnt++;
			}
			else if(Character.isAlphabetic(ch[i]))
			{
				cnt1++;
			}
		}
		if(cnt>=5 && cnt1<=3)
		{
			System.out.println("it's a GOOD string");
		}
		else
		{
			System.out.println("it's a BAD string");
		}
	}

}
