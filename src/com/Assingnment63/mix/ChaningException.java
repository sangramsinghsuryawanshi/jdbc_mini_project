package com.Assingnment63.mix;

import java.io.FileReader;
import java.io.IOException;

public class ChaningException
{
	public static void isV() throws Exception
	{
			FileReader fr = new FileReader("text.txt");
			fr.read();
			fr.close();
		
	}
	public static void isV1() throws Exception
	{
		isV();
	}
	public static void isV2() throws Exception
	{
		try
		{
			isV1();
		}
		catch(Exception fe)
		{
			System.out.println(fe+""+fe.getMessage()+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		try {
			isV2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
