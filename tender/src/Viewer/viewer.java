package Viewer;

import java.util.Scanner;

import User.user;

public class viewer extends user
{
	public void showViewer()
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Name ");
	String viewerName = sc.nextLine();
	System.out.println("Welcome "+ viewerName + "!");
	System.out.println("`");
	}

}
