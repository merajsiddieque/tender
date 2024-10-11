package Viewer;

import java.util.Scanner;

public class viewer 
{
	public void showViewer()
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Name ");
	String viewerName = sc.nextLine();
	System.out.println("Welcome "+ viewerName + "!");
	}

}
