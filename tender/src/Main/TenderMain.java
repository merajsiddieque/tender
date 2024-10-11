package Main;

import java.util.Scanner;

import Contactor.Contractor;
import Project_Manager.ProjectManager;


public class TenderMain 
{
	int choice;
	
     public void getChoice(int input)
     {
    	this.choice=input;
     }
         
        
	public static void main(String[] args) 
	{
		int choice,pmChoice,adminChoice,indChoice,contractorChoice;
		String adminPassword,adminUserName,pmForgotPassword,pmSignUPPassword,pmSignUPUserName,pmPassword,pmUserName;
		
		
        	Scanner sc = new Scanner(System.in);
	 	System.out.println("Login Console");
	 	System.out.println(" 1.Administrator\n 2.Project Manager\n 3.Contractor\n 4.Individual\n 5.Exit\n ");
	 	choice = sc.nextInt();
	 	
	 	switch (choice) 
	 	{
	    case 1: 
	    	System.out.println("Admin Console");
	    	System.out.println(" 1.Sign In\n 2.Exit\n ");
	    	adminChoice = sc.nextInt();
		    	switch (adminChoice) 
		    	{
			    case 1: 
			    	System.out.println("Admin Sign In Console");
			    	System.out.println("\nEnter UserName");
			    	adminUserName = sc.nextLine();
			    	System.out.println("Enter Password ");
			    	adminPassword = sc.nextLine();
			        break;
			    case 2: 
			    	System.exit(0);
			    	break;
			    	default:
			    		System.out.println("Try Again !");
			    		break;
		    	}
		    	break;
	    case 2: 
	    	System.out.println("Project Manager Console");
	    	System.out.println(" 1.Sign In\n 2.Sign Up\n 3.Forgot Password\n 4.Exit\n ");
	    	pmChoice = sc.nextInt();
	    	switch (pmChoice) 
	    	{
	    	case 1: 
	    		System.out.println("Project Manager Sign In Console");
	    		System.out.println("Enter UserName");
	    		pmUserName = sc.nextLine();
	    		System.out.println("Enter Password ");
	    		pmPassword = sc.nextLine();
	    		break;
	    	case 2:
	    		System.out.println("Project Manager Sign Up Console");
	    		System.out.println("Enter UserName");
	    		pmSignUPUserName = sc.nextLine();
	    		System.out.println("Enter Password ");
	    		pmSignUPPassword = sc.nextLine();
	    		break;
	    	case 3: 
	    		System.out.println("Project Manager Forgot Password Console");
	    		System.out.println("Enter Password ");
	    		pmForgotPassword = sc.nextLine();
	    		break;
	    	case 4: 
	    		System.exit(0);
	    		break;
	    	}
	    	break;
	    case 3: 
	    	System.out.println("Contractor Console ");
	    	System.out.println(" 1.Sign In\n 2.Sign Up\n 3.Forgot Password\n 4.Exit\n ");
	    	contractorChoice = sc.nextInt();
	    	switch (contractorChoice) 
	    	{
	    	case 1: 
	    		System.out.println("Contractor Sign In Console");
	    		System.out.println("Enter UserName");
	    		String contractorUserName = sc.nextLine();
	    		System.out.println("Enter Password ");
	    		String contractorPassword = sc.nextLine();
	    		break;
	    	case 2:
	    		System.out.println("Contractor Sign Up Console");
	    		System.out.println("Enter UserName");
	    		String contractorSignUPUserName = sc.nextLine();
	    		System.out.println("Enter Password ");
	    		String contractorSignUPPassword = sc.nextLine();
	    		break;
	    	case 3: 
	    		System.out.println("Contractor Forgot Password Console");
	    		System.out.println("Enter Password ");
	    		String contractorForgotPassword = sc.nextLine();
	    		break;
	    	case 4: 
	    		System.exit(0);
	    		break;
	    	}
	    	break;
	    case 4: 
	    	System.out.println("Individual Console ");
	    	System.out.println(" 1.Sign In\n 2.Sign Up\n 3.Forgot Password\n 4.Exit\n ");
	    	indChoice = sc.nextInt();
	    	switch (indChoice) 
	    	{
	    	case 1: 
	    		System.out.println("Individual Sign In Console");
	    		System.out.println("Enter UserName");
	    		String indUserName = sc.nextLine();
	    		System.out.println("Enter Password ");
	    		String indPassword = sc.nextLine();
	    		break;
	    	case 2:
	    		System.out.println("Individual Sign Up Console");
	    		System.out.println("Enter UserName");
	    		String indSignUPUserName = sc.nextLine();
	    		System.out.println("Enter Password ");
	    		String indSignUPPassword = sc.nextLine();
	    		break;
	    	case 3: 
	    		System.out.println("Individual Forgot Password Console");
	    		System.out.println("Enter Password ");
	    		String indForgotPassword = sc.nextLine();
	    		break;
	    	case 4: 
	    		System.exit(0);
	    		break;
	    	}
	    	break;
	    	
	    case 5:
	    	System.exit(0);
	    	break;
	    	default:
	    		System.out.println("Try Again !");
	    		break;
	 	}
	 	
	 	
//	 	TenderMain TM = new TenderMain();
//	 	
//	 	TM.getChoice(choice);
	 	
	 	
	   
	}

}
