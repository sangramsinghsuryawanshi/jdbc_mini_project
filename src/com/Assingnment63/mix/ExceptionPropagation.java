package com.Assingnment63.mix;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionPropagation 
{
	public static void isV() throws IOException
	{
			FileReader fr = new FileReader("text.txt");
			fr.read();
			fr.close();
	}
	public static void isChe()
	{
		try
		{
			isV();
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
		isChe();
	}
}
