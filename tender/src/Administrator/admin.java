package Administrator;
import java.io.IOException;
import java.util.Scanner;
import Main.MainSwitch;
import User.user;
public class admin extends user{
	public void ADMainSwitch() throws IOException{
		MainSwitch ms = new MainSwitch();
		ms.mainSwitch();
	}
	public int  AfterAdmin(){
        Scanner sc = new Scanner(System.in);
		System.out.println("Welcome Admin");
		System.out.println(" 1.Manage Tenders \n 2.Manage Project Managers\n 3.Manage Contractors \n 4. See Complaints Inbox.\n 5. Go Back");
		int x = sc.nextInt();
		return x;	
	}
	public int  adminSwitch() {
		Scanner sc = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		Scanner z = new Scanner(System.in);
		System.out.println("Admin Console");
		System.out.println(" 1.Sign In\n 2.Exit\n ");
		int innerChoices = sc.nextInt();
		switch (innerChoices) {
		case 1:
			System.out.println("\nEnter Admin UserName");
			String adminUserName = y.nextLine();
			System.out.println("Enter Admin Password ");
			String adminPassword = z.nextLine();
			
		    if (adminUserName.equals("admin")&& adminPassword.equals("password")) {
						return AfterAdmin();
			} else {
				System.out.println("Invalid Credentials");
				return 0;
				
			}
		
		case 2:
			// try {
			// Runtime.getRuntime().exec("cmd /c start cmd /c exit");
			System.exit(0);
			// } catch (IOException e) {
			// e.printStackTrace();
			// }
			return 0;
		default:
			System.out.println("Invalid choice");
			return 0;
		}
	}

}
