package FileHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class DBConnect 
{
	public static void createDataBase()
	{
		try
		{
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "a!am";
			
			
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement stm = conn.createStatement();
			
			String query = "create database tender";
			boolean b1 = stm.execute(query);

			System.out.println("Database created Successfully!" + b1);
			conn.close();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	public void CreateTable()
	{
		try
		{
			String url = "jdbc:mysql://localhost:3306/tender";
			String userName = "root";
			String password = "a!am";
			
			
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement stm = conn.createStatement();
			
			String query = "create table Records(company varchar(100),tenderName varchar(50),budget float)";
			stm.execute(query);

			System.out.println("Table created Successfully!");
			conn.close();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	public void insertData()
	{
		try
		{
			String url = "jdbc:mysql://localhost:3306/tender";
			String userName = "root";
			String password = "a!am";
			
			
			Connection conn = DriverManager.getConnection(url,userName,password);
			
			String query = "insert into records (company,tenderName,budget) values(?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setString(1, "xyz");
			pstm.setString(2, "abc");
			pstm.setInt(3, 5000);
			
			pstm.execute();
			
			System.out.println("insert data Successfully!");
			conn.close();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public void readTable()
	{
		try
		{
			String url = "jdbc:mysql://localhost:3306/tender";
			String userName = "root";
			String password = "a!am";
			
			
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement stm = conn.createStatement();
			
			String query = "select * from records";
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println("company = "+rs.getString(1));
				System.out.println("tenderName = "+rs.getString(2));
				System.out.println("budget = "+rs.getInt(3));
			}
			System.out.println("Table Data executed Successfully!");
			conn.close();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		DBConnect dbc = new DBConnect();
		dbc.readTable();
		
	}

}
