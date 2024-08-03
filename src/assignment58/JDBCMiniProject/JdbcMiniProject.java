
package assignment58.JDBCMiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMiniProject 
{
	static Connection con;
	static String insert;
	static String select;
	static String update;
	static String delete;
	static PreparedStatement ps;
	static Scanner sc;
	public static void createConnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentno_3","root","12345");
			insert="insert into Employee values(?,?,?,?,?,?)";
			select="select * from Employee";
			update="update Employee set Emp_Name=?, Course=?, City=?, Total_Marks=?, Phone_No=? where Emp_Id=?";
			delete="delete from Employee where Emp_Id=?";
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void insertQuery()
	{
		
		try 
		{			
			ps = con.prepareStatement(insert);
			
			while(true)
			{
				Scanner sc = new Scanner(System.in);
				
				System.out.println("enter Emp_Id : ");
				int id = sc.nextInt();
				 ps.setInt(1, id);
				 System.out.println("Enter Emp_Name : ");
				 String name = sc.next();

				 ps.setString(2, name);
				
				 System.out.println("Enter Course : ");
				 String course = sc.next();
				 ps.setString(3, course);
				 
				 System.out.println("Enter City : ");
				 String City = sc.next();
				 ps.setString(4, City);
				 		
				 System.out.println("Enter Total_Marks : ");
				 double total_Marks = sc.nextDouble();
				 ps.setDouble(5, total_Marks);
				 
				 System.out.println("Enter Phone_No : ");
				 String phone_No = sc.next();
				 ps.setString(6, phone_No);
				 
				 ps.addBatch();
				 
				 System.out.println("Do you want to conitue press yes(y) or No (n) : ");
				 char c = sc.next().charAt(0);
				 if(c=='n')
					 break;
			}
			ps.executeBatch();
			
			System.out.println("Data inserted successfully...\n");
						
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void selectQuery()
	{
		try 
		{
			ps = con.prepareStatement(select);
			ResultSet rs = ps.executeQuery();
			System.out.println("+--------+----------+--------+------+-------------+----------+");
			System.out.println("| Emp_id | Emp_Name | Course | City | Total_Marks | Phone_No |");
			System.out.println("+--------+----------+--------+------+-------------+----------+");
			while(rs.next())
			{
				System.out.println("|     "+rs.getInt(1)+"  | "+rs.getString(2)+"  | "+rs.getString(3)+"    | "+rs.getString(4)+"  | "+rs.getDouble(5)+"       | "+rs.getString(6)+" | ");
				System.out.println("+--------+----------+--------+------+-------------+----------+");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void updateQuery()
	{
		try 
		{
			 sc = new Scanner(System.in);
			 ps = con.prepareStatement(update);
			 System.out.println("Enter Emp_Name : ");
			 String name = sc.next();

			 ps.setString(1, name);
			
			 System.out.println("Enter Course : ");
			 String course = sc.next();
			 ps.setString(2, course);
			 
			 System.out.println("Enter City : ");
			 String City = sc.next();
			 ps.setString(3, City);
			 		
			 System.out.println("Enter Total_Marks : ");
			 double total_Marks = sc.nextDouble();
			 ps.setDouble(4, total_Marks);
			 
			 System.out.println("Enter Phone_No : ");
			 String phone_No = sc.next();
			 ps.setString(5, phone_No);
			 
			 System.out.println("enter Emp_Id : ");
			 int id = sc.nextInt();
			 ps.setInt(6, id);
			 System.out.println("updeted successfull...");
			 ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void deleteQuery()
	{
		try 
		{
			sc = new Scanner(System.in);
			ps = con.prepareStatement(delete);
			System.out.println("enter Emp_Id : ");
			int id = sc.nextInt();
			ps.setInt(1, id);
			System.out.println("deleted successfull...");
			ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException 
	{
	
		try 
		{
			createConnection();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter given choice\n");
			int ch=1;
			while(ch!=-1)
			{
				System.out.print(""
						+ "-----------------------------------\n"
						+ "1.Insert student information:\n"
						+ "2.View the list of student:\n"
						+ "3.Edit the student information:\n"
						+ "4.Delete the student information:\n"
						+ "5.Terminate the loop:\n");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1: insertQuery();
					break;
					case 2 : selectQuery();
					break;
					case 3 : updateQuery();
					break;
					case 4 : deleteQuery();
					break;
					case 5 : ch=-1;
					System.out.println("Teriminated...!");
					break;
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}

}
