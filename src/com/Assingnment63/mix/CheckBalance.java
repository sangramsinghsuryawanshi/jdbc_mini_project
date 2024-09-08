/*
 * 11.Design a class BankAccount with methods to deposit, withdraw, and check balance. 
 * Implement subclasses SavingsAccount and CheckingAccount.
 */
package com.Assingnment63.mix;

import java.util.Scanner;
class InsufficientBalance extends Exception
{
	InsufficientBalance(String msg)
	{
		super(msg);
	}
}
class BankAccount
{
	static Scanner sc;
	static long depo=0;
	static long withd=0;
	static long bal=0;
	static long cnt=0;
	public static void deposite()
	{
		sc= new Scanner(System.in);
		cnt++;
		System.out.println("Enter Deposite Money: ");
		depo = sc.nextInt();
		System.out.println("Amount Deposited Suceessfully: "+depo);
		System.out.println("--------------------<>-------------------");
	}
	public static void withdraw()throws InsufficientBalance
	{
		if(bal>0)
		{
		
			sc= new Scanner(System.in);
			cnt=0;
			System.out.println("Enter Withdrawal Money: ");
			withd = sc.nextInt();
			System.out.println("Amount Withdrawal Suceessfully: "+withd);
			System.out.println("--------------------<>-------------------");
		}
		else
		{
			throw new InsufficientBalance("Insufficient Balance: "+bal);
		}
	}
	public static void checkBalance()
	{
		if(cnt>=1)
		{
			long c=bal+=depo;
			System.out.println("Your Balance is: "+(c));
		}
		else
		{
			long w=bal-=withd;
			System.out.println("Your Balance is: "+(w));
		}
	}
}
public class CheckBalance {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int ch =-1;
		while(ch!=0)
		{
			System.out.println("Enter your choice\n1.Deposite\n2.Withdraw\n3.Check Balance\n4.Exit");
			ch=sc.nextInt();
			System.out.println("---------------<>-----------------");
			switch(ch)
			{
				case 1: BankAccount.deposite();
				break;
				case 2: try {
					BankAccount.withdraw();
				} catch (InsufficientBalance e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				};
				break;
				case 3: BankAccount.checkBalance();;
				break;
				case 4: ch=0;
				System.out.println("Processes Terminated.....!");
				break;
			}
		}
		System.out.println("-------------------<>------------------");
	}

}
