/*
 * 
Q1.You have been given a task to analyze a text file using Java file handling. 
Your goal is to determine the frequency of each character present in the file. 
Write a Java program that reads the content of a specified text file and 
calculates the frequency of each character (including letters, digits, 
punctuation, and whitespace). Implement this program using file
handling concepts in Java.

Your program should be able to answer the following questions:

1.How many times does each character appear in the file?
2.Which character appears the most frequently?
3.Are there any characters that do not appear in the file?

 */
package assignment53.FileHandling.recursion.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AnalyzeTextFile 
{
	public static void isAnalyze() throws IOException
	{
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\File.txt");
			Scanner sc = new Scanner(fr);
			StringBuilder sb = new StringBuilder();
			int cnt=0;
			while(sc.hasNext())
			{
				sb.append(sc.nextLine());
			}
			int max=0;
			char c='\0';
			for(int i=0;i<sb.length();i++)
			{
				if(Character.isAlphabetic(sb.charAt(i)))
				{
					cnt++;
				}
				int mcnt=1;
				for(int j=i+1;j<sb.length();j++)
				{
					if(sb.charAt(i)==sb.charAt(j))
					{
						mcnt++;
					}
				}
				if(sb.charAt(i)!=' ' && mcnt>max)
				{
					max=mcnt;
					c=sb.charAt(i);
				}
			}
			System.out.println(sb);
			int[] frequency = new int[128];
			for (int i=0;i<sb.length();i++) 
			{
				char ch = sb.charAt(i);
	            if (ch < 128) 
	            {
	            	frequency[ch]++;
	            }
	        }
			System.out.println("Char is not present: ");
			for(int i=32;i<=126;i++)
			{
				if (frequency[i] == 0) 
				{
					System.out.print((char)i+" ");
	            }
			}
			System.out.println("\nEach character appear in the file: "+cnt);
			System.out.println("Character appears the most frequently: "+c+"<-char::count->"+max);
			sc.close();
			fr.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException 
	{
		isAnalyze();
	}
}
