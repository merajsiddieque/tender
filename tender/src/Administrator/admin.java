package Administrator;
import java.io.IOException;
import java.util.Scanner;
import Main.MainSwitch;
import User.user;
public class admin extends user{
	Scanner sc = new Scanner(System.in);
	public void ADMainSwitch(){
		MainSwitch ms = new MainSwitch();
		ms.mainSwitch();
	}
	public int  AfterAdmin(){
		System.out.println("Welcome Admin");
		System.out.println(" 1.Manage Tenders \n 2.Manage Project Managers\n 3.Manage Contractors \n 4. See Complaints Inbox.\n 5. Go Back");
		int x = sc.nextInt();
		return x;	
	}
	public int  adminSwitch() {
		System.out.println("Admin Console");
		System.out.println(" 1.Sign In\n 2.Exit\n ");
		sc.nextLine();
		int innerChoices = sc.nextInt();
		sc.nextLine();
		switch (innerChoices) {
		case 1:
			System.out.println("\nEnter Admin UserName");
			String adminUserName = sc.nextLine();
			System.out.println("Enter Admin Password ");
			sc.nextLine();
			String adminPassword = sc.nextLine();
			
		    if (adminUserName.equals("admin")&& adminPassword.equals("password")) {
						return AfterAdmin();
			} else {
				System.out.println("Invalid Credentials");
				return 0;
				
			}
		
		case 2:
			System.exit(0);
			return 0;
		default:
			System.out.println("Invalid choice");
			return 0;
		}
	}

}
