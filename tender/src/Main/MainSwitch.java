package Main;
import Administrator.admin;
import Project_Manager.ProjectManager;
import java.util.Scanner;

public class MainSwitch {

	public void mainSwitch() 
	{
		int choice;	
        Scanner sc = new Scanner(System.in);
	 	System.out.println("Login Console");
	 	System.out.println(" 1.Administrator\n 2.Project Manager\n 3.Contractor\n 4.Individual\n 5.Exit");
	 	choice = sc.nextInt();
	 	
	 	switch (choice) 
	 	{
	    case 1: 
	    	
	    	admin ad = new admin();
			ad.adminSwitching();
		    break;

	    case 2: 
		ProjectManager pm= new ProjectManager();
		pm.pmSwitching();
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
	      
	    	break;
	 	}

}

}
