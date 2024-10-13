package Viewer;

import FileHandling.FileHandling;
import User.user;
import java.io.IOException;
import java.util.Scanner;

public class viewer extends user
{
	Scanner sc = new Scanner(System.in);
	
	
	
	public void showViewer()
	{
	System.out.println("Enter Your Name ");
	String viewerName = sc.nextLine();
	System.out.println("Welcome "+ viewerName + "!");
	}
	
	
	
	public void viewSwitch() 
	{
		System.out.println(" 1.Previous Year Tenders\n 2.Newly Filed Tenders\n 3.Exit\n ");
		int Choice = sc.nextInt();
		switch (Choice) 
		{
		case 1:
			FileHandling fh = new FileHandling();
			fh.viewPreviousRecords();
			break;
		case 2:
			System.out.println("Data not provided");
			
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Not Valid Choice ! Try again");
		}
		
	}
	
	
	
	

}
