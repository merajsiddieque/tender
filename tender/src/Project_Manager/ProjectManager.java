package Project_Manager;

import java.util.Scanner;

public class ProjectManager {
	public void pmSwitch() {
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
			} else {
				System.out.println("Invalid Credentials");
			}

			break;
		case 2:
			// try {
			// Runtime.getRuntime().exec("cmd /c start cmd /c exit");
			System.exit(0);
			// } catch (IOException e) {
			// e.printStackTrace();
			// }
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
