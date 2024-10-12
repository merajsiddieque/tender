package Contractor;

import java.util.Scanner;

import User.user;

public class Contractor extends user{

	public void concSwitch() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Contractor Console ");
		System.out.println(" 1.Sign In\n 2.Sign Up\n 3.Forgot Password\n 4.Exit\n ");
		int Choice = sc.nextInt();
		switch (Choice) 
		{
		case 1:
			System.out.println("Contractor Sign In Console");
			System.out.println("Enter UserName");
			String UserName = sc.nextLine();
			System.out.println("Enter Password ");
			String Password = sc.nextLine();
			break;
		case 2:
			System.out.println("Contractor Sign Up Console");
			System.out.println("Enter UserName");
			String SignUPUserName = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Password ");
			String SignUPPassword = sc.nextLine();
			break;
		case 3:
			System.out.println("Contractor Forgot Password Console");
			System.out.println("Enter Password ");
			String ForgotPassword = sc.nextLine();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Not Valid Choice ! Try again");
		}
		
	}

}
