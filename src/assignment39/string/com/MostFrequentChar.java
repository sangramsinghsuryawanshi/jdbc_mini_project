/*
 * 11. Write a program that takes in a string and 
 * finds the most frequent character in it.
 */
package assignment39.string.com;

import java.util.Scanner;

public class MostFrequentChar {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 String s = sc.nextLine();
		 char ch[]=s.toCharArray();
		 char c='\0';
		 int max=0,c1=0;
		 for(int i=0;i<ch.length;i++)
		 {
			 int cnt=1;
			 for(int j=i+1;j<ch.length;j++)
			 {
				 if(ch[i]==ch[j])
				 {
					 cnt++;
					 ch[j]='\0';
				 }
			 }
			 if(ch[i]!='\0' && ch[i]!=' ')
			 {
				if(cnt>max)
				{
					max=cnt;
					c=ch[i];
				}
			 }
		 }
		 System.out.println("The most frequent character is: "+c);
	}

}
