package Main;
import Administrator.adminManagement;
import Contractor.Contractor;
import Project_Manager.ProjectManager;
import Viewer.viewer;

import java.io.IOException;
import java.util.Scanner;

public class MainSwitch {

	public void mainSwitch() throws IOException {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Login Console");
		System.out.println(" 1.Administrator\n 2.Project Manager\n 3.Contractor\n 4.Viewer\n 5.Exit");
		choice = sc.nextInt();

		switch (choice) {
		case 1:

			adminManagement ad = new adminManagement();
			ad.Access();
			break;

		case 2:
			ProjectManager pm = new ProjectManager();
			pm.pmSwitch();
			break;

		case 3:
			Contractor conc = new Contractor();
			conc.concSwitch();

		case 4:
			viewer vw = new viewer();
			vw.showViewer();
			vw.viewSwitch();

		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice \n");

			break;
		}

	}

}
