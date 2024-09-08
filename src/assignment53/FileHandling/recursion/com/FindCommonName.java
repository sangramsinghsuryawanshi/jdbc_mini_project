/*
 * Q.2 You are given two text files, file1.txt and file2.txt,
 *  both of which contain a list of names.   Your task is to 
 *  find names that are common to both files and write them 
 *  to a new file called common_names.txt. 
 */
package assignment53.FileHandling.recursion.com;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FindCommonName {

	public static void main(String[] args) 
	{
		try
		{
			File f1 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\File1.txt");
			File f2 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\File2.txt");
			File f3 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\common_names.txt");
		
			FileWriter fw = new FileWriter(f3);
			Scanner sc = new Scanner(f1);
			StringBuilder sb = new StringBuilder();
			while(sc.hasNext())
			{
				sb.append(sc.nextLine());
			}
			Scanner sc1 = new Scanner(f2);
			StringBuilder sb1 = new StringBuilder();
			while(sc1.hasNext())
			{
				sb1.append(sc1.nextLine());
			}
			String st = sb.toString();
			String str = sb1.toString();
			String s1[]=st.split(" ");
			String s2[]=str.split(" ");
			for(int i=0;i<s1.length;i++)
			{
				for(int j=0;j<s2.length;j++)
				{
					if(s1[i].equals(s2[j]))
					{
						fw.write(s1[i]+" ");
					}
				}
			}
			fw.close();
			Scanner sc2 = new Scanner(f3);
			StringBuilder sb2 = new StringBuilder();
			while(sc2.hasNext())
			{
				sb2.append(sc2.nextLine());
			}
			System.out.println(sb2+" ");
			sc2.close();
			sc.close();
			sc1.close();
			System.out.println("Given content is written...!");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Something went wrong...!");
		}
	}

}
