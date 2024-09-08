/*
 * Q2.Write a Java program that simulates a bank account. Create a custom exception class called
  "InsufficientBalanceException" and raise it whenever a withdrawal is attempted with an amount
 higher than the account balance. Handle the custom exception and display an error message

 */
package assignment36.exception.com;

import java.util.Scanner;

class AuthenticationLockoutException extends Exception
{
	AuthenticationLockoutException(String m)
	{
		super(m);
	}
}
class BankAccount
{
	public void newUser(Scanner sc)
	{
		System.out.print("*****************User Registration*******************");
		System.out.print("\nEnter your name:Ex-->(RajSuryawanshi): ");
		String name=sc.next();
		System.out.print("\nEnter your Email-id:Ex-->(ABC@gmail.com): ");
		String email=sc.next();
		System.out.print("\nEnter your Pan-card number:Ex-->(EJAPS0276M): ");
		String pancard=sc.next();
		System.out.print("\nEnter your Adhar-card number:Ex-->(0000 1111 2222): ");
		String adharcard=sc.next();
		System.out.print("\nEnter your mobile number:Ex-->(+91 8975675687): ");
		long mnumber=sc.nextLong();
		System.out.print("\nEnter your Password:Ex-->(ABC@#$34): ");
		String pass=sc.next();
		System.out.print("\nYour name is: "+name);
		System.out.print("\nYour Email-id is: "+email);
		System.out.print("\nYour Pan-card number is: "+pancard);
		System.out.print("\nYour Adhar-card number is: "+adharcard);
		System.out.print("\nYour mobile number is: "+mnumber);
		System.out.print("\nYour Password is: "+pass);
		System.out.print("\n**************Registraction Successfully***************");
		
	}
	public void userLogin(Scanner sc) throws Exception
	{
		System.out.print("*****************User Login*******************");
		System.out.print("\nEnter your name:Ex-->(RajSuryawanshi): ");
		String name=sc.next();
		System.out.print("\nEnter your Email-id:Ex-->(ABC@gmail.com): ");
		String email=sc.next();
		int i=1,n=3;
		while(i<=n)
		{
			System.out.print("\nEnter your Password:Ex-->(ABC@#$34): ");
			long pass=sc.nextLong();
			if(pass==1234)
			{
				System.out.print("\nYour name is: "+name);
				System.out.print("\nYour Email-id is: "+email);
				System.out.print("\nYour Password is: "+pass);
				System.out.print("\n**************Login Successfully***************");
				break;
			}
			else if(n<=i)
			{
				throw new AuthenticationLockoutException("A user exceeds the maximum allowed login attempts: "+n);
			}
			this.deposite(sc);
			System.out.print("\nPassword Incoorect");
			System.out.print("\nYou have "+(n-i)+" chance remaning");
			i++;
		}
	}
	public void deposite(Scanner sc)
	{
		System.out.println("Hi");
	}
}
public class SimulatesBankAccount 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: \n1(Create new account) \n2(Already have a account)");
		int ch=sc.nextInt();
		BankAccount b = new BankAccount();
		switch(ch)
		{
			case 1: b.newUser(sc);
			break;
			case 2: 
				try 
				{
					b.userLogin(sc);
				} 
				catch (Exception e) 
				{
					System.out.println(e);
			}
			break;
		}
	}

}
