package Project_Manager;

import java.util.Scanner;

public class ProjectManager 
{
	public static void innerSwitching() {
		Scanner sc = new Scanner(System.in);

		int innerChoices = sc.nextInt();
		sc.nextLine();
		switch (innerChoices) {
			case 1:
				System.out.println("\nEnter UserName");
				String pmUserName = sc.nextLine();
				System.out.println("Enter Password ");
				String pmPassword = sc.nextLine();

				if(pmUserName.equals("Project Manager") && pmPassword.equals("password"))
				{
					System.out.println("Welcome Admin");
				}
				else
				{
					System.out.println("Invalid Credentials");
				}

				break;
			case 2:
				// try {
				// 	Runtime.getRuntime().exec("cmd /c start cmd /c exit");
					System.exit(0);
				// } catch (IOException e) {
				// 	e.printStackTrace();
				// }
				break;
			default:
				System.out.println("Invalid choice");
		}
	}

}
