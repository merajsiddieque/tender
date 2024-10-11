package Main;

import java.io.IOException;
import java.util.Scanner;

public class TenderMain {
	public static void innerSwitching() {
		Scanner sc = new Scanner(System.in);

		int innerChoices = sc.nextInt();

		switch (innerChoices) {
			case 1:

				System.out.println("\nEnter UserName");
				String adminUserName = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter Password ");
				String adminPassword = sc.nextLine();

				break;
			case 2:
				try {
					Runtime.getRuntime().exec("cmd /c start cmd /c exit");
					System.exit(0);
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;
			default:
				System.out.println("Invalid choice");
				main(null);
		}
	}

	public static void main(String[] args) 
	{
		int choice;
				
		TenderMain cont = new TenderMain();		
		TenderMain ind = new TenderMain();		
        Scanner sc = new Scanner(System.in);
	 	System.out.println("Login Console");
	 	System.out.println(" 1.Administrator\n 2.Project Manager\n 3.Contractor\n 4.Individual\n 5.Exit");
	 	choice = sc.nextInt();
	 	
	 	switch (choice) 
	 	{
	    case 1: 
	    	System.out.println("Admin Console");
	    	System.out.println(" 1.Sign In\n 2.Exit\n ");
	    	TenderMain admin = new TenderMain();
			admin.innerSwitching();
		    break;

	    case 2: 
	    	System.out.println("Project Manager Console");
	    	System.out.println(" 1.Sign In\n 2.Exit\n ");
			TenderMain pm = new TenderMain();		
	    	pm.innerSwitching();
	    	break;

	    case 3: 
	    	System.out.println("Contractor Console ");
	    	System.out.println(" 1.Sign In\n 2.Sign Up\n 3.Forgot Password\n 4.Exit\n ");
			int adminChoice = sc.nextInt();
	    	switch (adminChoice) 
 	        {
 	          case 1:
 		        System.out.println("Sign In Console");
 		        System.out.println("Enter UserName");
 		        String UserName = sc.nextLine();
 		        System.out.println("Enter Password ");
 		        String Password = sc.nextLine();
 		        break;
 	          case 2:
 	          	System.out.println("Project Manager Sign Up Console");
 	          	System.out.println("Enter UserName");
 	          	String SignUPUserName = sc.nextLine();
 	          	sc.nextLine();
 	          	System.out.println("Enter Password ");
 	          	String SignUPPassword = sc.nextLine();
 	          	break;
 	          case 3: 
 	          	System.out.println("Project Manager Forgot Password Console");
 	          	System.out.println("Enter Password ");
 	          	String ForgotPassword = sc.nextLine();
 	          	break;
 	          case 4: 
 	          	System.exit(0);
 	          	break;
 	          default:
 	          	System.out.println("Not Valid Choice ! Try again");
            }
			
	    case 4: 
	    	System.out.println("Individual Console ");
	    	
	    case 5:
	    	System.exit(0);
	    	break;
	    default:
	      System.out.println("Invalid choice \n");
	      main(null);
	    	break;
	 	}

}

}
