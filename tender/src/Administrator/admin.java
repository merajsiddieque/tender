package Administrator;

import java.util.Scanner;

public class admin {
    public static void innerSwitching() {
		Scanner sc = new Scanner(System.in);

		int innerChoices = sc.nextInt();
		sc.nextLine();
		switch (innerChoices) {
			case 1:
				System.out.println("\nEnter UserName");
				String adminUserName = sc.nextLine();
				System.out.println("Enter Password ");
				String adminPassword = sc.nextLine();

				if(adminUserName.equals("admin") && adminPassword.equals("password"))
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
