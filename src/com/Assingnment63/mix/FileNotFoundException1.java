package com.Assingnment63.mix;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException1 
{
	public static void isV()
	{
		try
		{
			FileReader fr = new FileReader("text.txt");
			fr.read();
			fr.close();
		}
		catch(FileNotFoundException fe)
		{
			System.out.println(fe);
		}
		catch(IOException fe)
		{
			System.out.println(fe);
		}
	}
	public static void main(String[] args) 
	{
		isV();
	}
}
