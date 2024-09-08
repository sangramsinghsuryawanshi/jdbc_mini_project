/*
 * Q3. Extract the integers (Zoho)
Input:
s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
3: Rishabh Gupta56"
Output: 1 2 3 56
Explanation:
1, 2, 3, 56 are the integers present in s.

 */
package assignment35.string.com;

import java.util.Scanner;

public class ExtractIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int c=0;
		for(int i=0;i<ch.length-1;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				System.out.print(ch[i]+"");
				if(Character.isDigit(ch[i+1]))
				{
					System.out.print(ch[i+1]+"");
					
				}
				System.out.print(" ");
			}
		}
	}

}
