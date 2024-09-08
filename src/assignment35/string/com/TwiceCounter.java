/*
 * Q11. Twice Counter
Input:
N = 3
list = {Geeks, For, Geeks}
Output: 1
Explanation: 'Geeks' is the only word that
appears twice.

 */
package assignment35.string.com;

import java.util.Scanner;

public class TwiceCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].contains(s[j]))
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(s[i]+" ");
			}
		
		}
	}

}
