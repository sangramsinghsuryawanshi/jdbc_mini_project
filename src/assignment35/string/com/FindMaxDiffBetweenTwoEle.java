/*
 * Q20. Maximum number of characters between any two same character
Given a string containing lower and uppercase alphabets, the task is to find the maximum
number of characters between any two same characters in the string.
Example 1:
Input:
S = "socks"
Output: 3
Explanation: There are 3 characters between
the two occurrences of 's'.
 */
package assignment35.string.com;
import java.util.Scanner;
public class FindMaxDiffBetweenTwoEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int temp=0;
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
						cnt++;
						temp=j;
					
				}
			}
			if(cnt!=0) 
			{
				int cntw=0;
				for(int k=i+1;k<temp;k++) 
				{
					cntw++;
				}
				System.out.println(s.charAt(i)+"-->"+cntw);
				
			}
		}
	}
}