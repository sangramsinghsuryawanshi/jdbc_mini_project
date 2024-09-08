/*
 * Q1. WAP to create the custome exception to throw the messgae if user is not
 *  eligiblefor blood donation, message will be you're not eligible for blood 
 *  donation.
 */
package assignment36.exception.com;
import java.util.Scanner;
class AgeNotValidException extends Exception
{
	AgeNotValidException(String m)
	{
		super(m);
	}
}
public class CoustomExceptionBlodDonation 
{
	public void bloodDonation() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int n=sc.nextInt();
		if(n>=18)
		{
			System.out.println("you're eligible for blood donation");
		}
		else
		{
			throw new AgeNotValidException("\nyou're not eligible for blood donation");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CoustomExceptionBlodDonation c = new CoustomExceptionBlodDonation();
		try 
		{
			c.bloodDonation();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
