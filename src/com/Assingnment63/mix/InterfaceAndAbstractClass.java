package com.Assingnment63.mix;

interface Abc
{
	private void ps()
	{
		System.out.println("happy");
	}
	default void is()
	{
		System.out.println("private acces.");
		this.ps();
	}
}
public class InterfaceAndAbstractClass implements Abc
{
	public void is1() 
	{
		System.out.println("Abstract");
		is();
	}
	public static void main(String[] args) 
	{
		InterfaceAndAbstractClass in = new InterfaceAndAbstractClass();
		in.is1();
	}

}
