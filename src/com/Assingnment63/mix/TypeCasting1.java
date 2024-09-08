package com.Assingnment63.mix;

public class TypeCasting1 
{
	public void isTypeCast(Object d)
	{
		
		try
		{
			String s=(String)d;
			System.out.println(s);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
	public static void main(String[] args) 
	{
		TypeCasting1 c = new TypeCasting1();
		c.isTypeCast(3.3);
	}
}

