/*
 * Q22. Difficulty of sentence
Given a sentence as a string S. Calculate difficulty of a given sentence.
Difficulty of sentence is defined as 5*(number of hard words) + 3*(number of easy words). A
word in the given string is considered hard if it has 4 consecutive consonants or the number of
consonants is more than the number of vowels. Else the word is easy.
Note: uppercase and lowercase characters are the same.
Example Input:
S = "Difficulty of sentence"
Output:13
Explanation: 2 hard words + 1 easy word
Example
Input:S = "I am good"
Output:9
Explanation:3 easy word
 */
package assignment35.string.com;
import java.util.Scanner;
public class DificulatyOfSentence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		int cnthard=0,cntsi=0;
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) 
		{
			int cnt = 0, cnt1 = 0;
			for(int j=0;j<str[i].length();j++)
			{
				if (str[i].charAt(j) == 'a' || str[i].charAt(j) == 'e' || str[i].charAt(j) == 'i' || str[i].charAt(j) == 'o'
						|| str[i].charAt(j) == 'u') 
				{
					cnt++;
				} 
				else 
				{
					cnt1++;
				}
			}
			if (cnt1 > cnt) 
			{
				cnthard++;
			}
			else 
			{
				cntsi++;
			}
		}
		System.out.println(5*(cnthard) + 3*(cntsi));
	}
}
