package com.Assingnment63.mix;
class InvalidAgeExceptionOccu extends Exception
{
	InvalidAgeExceptionOccu(String msg)
	{
		super(msg);
	}
}
public class InvalidAgeException 
{
	public static void isValid() throws InvalidAgeExceptionOccu
	{
		int age=18;
		if(age>17)
		{
			throw new InvalidAgeExceptionOccu("Enter valid age"); 
		}
		else
		{
			System.out.println("Valid Age..");
		}
	}
	public static void main(String[] args) 
	{
		try {
			isValid();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
