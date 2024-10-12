package Project_Manager;

import java.util.Scanner;

import User.user;

public class ProjectManager extends user {
	public int pmSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Project Manager Console");
		System.out.println(" 1.Sign In\n 2.Exit\n ");

		int innerChoices = sc.nextInt();
		sc.nextLine();
		switch (innerChoices) {
		case 1:
			System.out.println("\nEnter Project Manager UserName");
			String pmUserName = sc.nextLine();
			System.out.println("Enter Project Amanager Password ");
			String pmPassword = sc.nextLine();

			if (pmUserName.equals("Project Manager") && pmPassword.equals("password")) {
				System.out.println("Welcome Project Manager");
				System.out.println("1.View Assigned Tender \n 2.View Received Bids \n 3.Sort the bids \n 4. File Complaints.\n 5.View Contractors");
				int x = sc.nextInt();
				return x;
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
