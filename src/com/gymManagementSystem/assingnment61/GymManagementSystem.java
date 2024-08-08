package com.gymManagementSystem.assingnment61;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GymManagementSystem
{
	static String ins;
	static String sel;
	static String upd;
	static String del;
	static String ser;
	static PreparedStatement ps;
	static Scanner sc;
	static Connection conn;
	public static Connection isConnected()
	{
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymManagmentSystem","root","12345");
			ins="insert into member values(?,?,?,?,?,?,?,?)";
			sel="select * from member";
			upd="update member set first_name=?, last_name=?, age=?, dod=?, email=?, phone_number=?, membership_type=? where member_id=?";
			del="delete from member where first_name=?";
			ser="select * from member where first_name=?";
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
	public static void isInserted()
	{
		try 
		{
			sc = new Scanner(System.in);
			PreparedStatement ps = isConnected().prepareStatement(ins);
			while(true)
			{
				String ent="Enter Member Id: ";
				String ent1="Enter First Name: ";
				String ent2="Enter Last Name: ";
				String ent3="Enter Your Age: ";
				String ent4="Enter Your Date Of Birth: ";
				String ent5="Enter Your Email: ";
				String ent6="Enter Your Phone Number: ";
				String ent7="Enter Your Membership: ";
				for(int i=0;i<ent.length();i++)
				{
					System.out.print(ent.charAt(i));
					Thread.sleep(50);
				}
				int mid=sc.nextInt();
				ps.setInt(1, mid);
				System.out.println("\n");
				
				for(int i=0;i<ent1.length();i++)
				{
					System.out.print(ent1.charAt(i));
					Thread.sleep(50);
				}
				String fn=sc.next();
				ps.setString(2, fn);
				System.out.println("\n");
				
				for(int i=0;i<ent2.length();i++)
				{
					System.out.print(ent2.charAt(i));
					Thread.sleep(50);
				}
				String ln=sc.next();
				ps.setString(3, ln);
				System.out.println("\n");
				
				for(int i=0;i<ent3.length();i++)
				{
					System.out.print(ent3.charAt(i));
					Thread.sleep(50);
				}
				int age=sc.nextInt();
				ps.setInt(4, age);
				System.out.println("\n");
				
				for(int i=0;i<ent4.length();i++)
				{
					System.out.print(ent4.charAt(i));
					Thread.sleep(50);
				}
				String dob=sc.next();
				ps.setString(5, dob);
				System.out.println("\n");
				
				for(int i=0;i<ent5.length();i++)
				{
					System.out.print(ent5.charAt(i));
					Thread.sleep(50);
				}
				String em=sc.next();
				ps.setString(6, em);
				System.out.println("\n");
				
				for(int i=0;i<ent6.length();i++)
				{
					System.out.print(ent6.charAt(i));
					Thread.sleep(50);
				}
				String pn=sc.next();
				ps.setString(7, pn);
				System.out.println("\n");
				
				for(int i=0;i<ent7.length();i++)
				{
					System.out.print(ent7.charAt(i));
					Thread.sleep(50);
				}
				String mt=sc.next();
				ps.setString(8, mt);
				System.out.println("\n");
				
				ps.addBatch();
				 
				System.out.println("Do you want to conitue press yes(y) or No (n) : ");
				System.out.println("----------------------------------------");
				 char c = sc.next().charAt(0);
				 if(c=='n')
					 break;
			}
			ps.executeBatch();
			System.out.println("************************************");
			System.out.println();
			System.out.println("Data inserted successfully.....");
			System.out.println();
			System.out.println("************************************");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void viewMember()
	{
		try 
		{
			System.out.println("************************************");
			System.out.println();
			ps = isConnected().prepareStatement(sel);
			ResultSet rs = ps.executeQuery();
			System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------------+-----------------+-----------------+");
			System.out.println("| Memeber_id      | First_Name      | Last_Name       | Age             | Date Of Birth   | Emial                 | Phone_Number    | Membership_Type |");
			System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------------+-----------------+-----------------+");
			while(rs.next())
			{
			System.out.println("|      "+rs.getInt(1)+"          |"+rs.getString(2)+"          | "+rs.getString(3)+"     | "+rs.getInt(4)+"              | "+rs.getDate(5)+"      | "+rs.getString(6)+"     | "+rs.getString(7)+"      |  "+rs.getString(8)+"        |");
			System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------------+-----------------+-----------------+");
			}
			System.out.println();
			System.out.println("************************************");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void updateMember() 
	{
	    try 
	    {
	        sc = new Scanner(System.in);
	        System.out.println("Enter your choice:\n"
	                + "1. Change first name\n"
	                + "2. Change last name\n"
	                + "3. Change age\n"
	                + "4. Change date of birth\n"
	                + "5. Change email\n"
	                + "6. Change phone number\n"
	                + "7. Change membership\n"
	                + "-----------------------------\n");
	        int ch = sc.nextInt();

	        String column = null;
	        String stringValue = null;
	        Integer intValue = null;

	        switch (ch) 
	        {
	            case 1:
	                System.out.println("Enter First_Name: ");
	                column = "first_name";
	                stringValue = sc.next();
	                break;
	            case 2:
	                System.out.println("Enter Last_Name: ");
	                column = "last_name";
	                stringValue = sc.next();
	                break;
	            case 3:
	                System.out.println("Enter Your Age: ");
	                column = "age";
	                intValue = sc.nextInt();
	                break;
	            case 4:
	                System.out.println("Enter date of birth: ");
	                column = "dob";
	                stringValue = sc.next();
	                break;
	            case 5:
	                System.out.println("Enter Your Email: ");
	                column = "email";
	                stringValue = sc.next();
	                break;
	            case 6:
	                System.out.println("Enter Your Phone Number: ");
	                column = "phone_number";
	                stringValue = sc.next();
	                break;
	            case 7:
	                System.out.println("Enter Your Membership Type: ");
	                column = "membership_type";
	                stringValue = sc.next();
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                return;
	        }

	        System.out.println("Enter Member Id: ");
	        int mid = sc.nextInt();

	        String updateQuery = "UPDATE member SET " + column + " = ? WHERE member_id = ?";
	        ps = isConnected().prepareStatement(updateQuery);

	        if (intValue != null) 
	        {
	            ps.setInt(1, intValue);
	        } 
	        else 
	        {
	            ps.setString(1, stringValue);
	        }
	        ps.setInt(2, mid);

	        ps.executeUpdate();
	        System.out.println("************************************");
	        System.out.println("Update successful...");
	        System.out.println("************************************");
	    } 
	    catch (Exception e) 
	    {
	        e.printStackTrace();
	    }
	}

	public static void deleteMember()
	{
		try 
		{
			sc = new Scanner(System.in);
			ps = isConnected().prepareStatement(del);
			System.out.println("Enter Your First Name : ");
			String fna = sc.next();
			ps.setString(1, fna);
			System.out.println("************************************");
			System.out.println();
			System.out.println("deleted successfull...");
			ps.executeUpdate();
			System.out.println();
			System.out.println("************************************");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void searchMember()
	{
		try 
		{
			sc = new Scanner(System.in);
			System.out.println("************************************");
			System.out.println();
			ps = isConnected().prepareStatement(ser);
			System.out.println("Enter your First_Name: ");
			String fnam=sc.next();
			ps.setString(1, fnam);
			ResultSet rs = ps.executeQuery();
			System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------------+-----------------+-----------------+");
			System.out.println("| Memeber_id      | First_Name      | Last_Name       | Age             | Date Of Birth   | Emial                 | Phone_Number    | Membership_Type |");
			System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------------+-----------------+-----------------+");
			while(rs.next())
			{
			System.out.println("|      "+rs.getInt(1)+"          |"+rs.getString(2)+"          | "+rs.getString(3)+"     | "+rs.getInt(4)+"              | "+rs.getDate(5)+"      | "+rs.getString(6)+"     | "+rs.getString(7)+"      |  "+rs.getString(8)+"        |");
			System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------------+-----------------+-----------------+");
			}
			System.out.println();
			System.out.println("************************************");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			isConnected();
			String choice="Enter Choice Below:1,2,3,4,5,6";
			String insert="1.Add New Memebers...";
			String fetch= "2.View All Memebers Data...";
			String update="3.Update Members Profile...";
			String delete="4.Delete Members Data...";
			String search="5.Search Any Member Using Name...";
			String terminate="6.Terminate Operation...";
			sc = new Scanner(System.in);
			int ch=-1;
			while(ch!=0)
			{
				for(int i=0;i<choice.length();i++)
				{
					System.out.print(choice.charAt(i));
					Thread.sleep(200);
				}
				System.out.println("\n");
				for(int i=0;i<insert.length();i++)
				{
					System.out.print(insert.charAt(i));
					Thread.sleep(50);
				}
				System.out.println("\n");
				for(int i=0;i<fetch.length();i++)
				{
					System.out.print(fetch.charAt(i));
					Thread.sleep(50);
				}
				System.out.println("\n");
				for(int i=0;i<update.length();i++)
				{
					System.out.print(update.charAt(i));
					Thread.sleep(50);
				}
				System.out.println("\n");
				for(int i=0;i<delete.length();i++)
				{
					System.out.print(delete.charAt(i));
					Thread.sleep(50);
				}
				System.out.println("\n");
				for(int i=0;i<search.length();i++)
				{
					System.out.print(search.charAt(i));
					Thread.sleep(50);
				}
				System.out.println("\n");
				for(int i=0;i<terminate.length();i++)
				{
					System.out.print(terminate.charAt(i));
					Thread.sleep(50);
				}
				System.out.println("\n------------------------------------");
				System.out.println("Enter your choice: ");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1: isInserted();
						break;
					case 2: viewMember();;
						break;
					case 3: updateMember();
						break;
					case 4: deleteMember();
						break;
					case 5: searchMember();
					break;
					case 6: ch=0;
					System.out.println("Teriminated...!");
					break;
					
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try {
				isConnected().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
