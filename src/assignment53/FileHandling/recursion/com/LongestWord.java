package assignment53.FileHandling.recursion.com;

import java.io.File;
import java.util.Scanner;

public class LongestWord 
{
	public static void main(String[] args) 
	{
		try 
		{
			File f = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\File2.txt");
		
			Scanner sc = new Scanner(f);
			StringBuilder sb = new StringBuilder();
			while(sc.hasNext())
			{
				sb.append(sc.nextLine());
			}
			System.out.println(sb);
			String str = sb.toString();
			String s1 []= str.split(" ");
			int max=0;
			String ch=null;
			for(int i=0;i<s1.length;i++)
			{
				if(s1[i].length()>max)
				{
					max=s1[i].length();
					ch=s1[i];
				}
			}
			System.out.println("Given longest word is: "+ch);
			sc.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Given text is not write..Failed..!");
		}
	}

}
