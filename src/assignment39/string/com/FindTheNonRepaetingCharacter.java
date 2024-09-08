/*
 * 9. Write a program that takes in a
 *  string and finds the first non-repeating character in it.
 */
package assignment39.string.com;

import java.util.Scanner;

public class FindTheNonRepaetingCharacter {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 String s = sc.nextLine();
		 char ch[]=s.toCharArray();
		 int temp=-1;
		 for(int i=0;i<ch.length;i++)
		 {
			 int cnt=0;
			 for(int j=0;j<ch.length;j++)
			 {
				 if(ch[i]==ch[j])
				 {
					 cnt++;
				 }
			 }
			 if(cnt==1)
			 {
				System.out.println(ch[i]+" "+cnt);
				break;
			 }
			
		 }
	}

}
