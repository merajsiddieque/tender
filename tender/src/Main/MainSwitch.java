package Main;
import Administrator.adminManagement;
import Contractor.Contractor;
import Project_Manager.PM_Managementt;
import Project_Manager.ProjectManager;
import Viewer.viewer;
import java.io.IOException;
import java.util.Scanner;

public class MainSwitch {

	public void mainSwitch() {
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
			PM_Managementt pm = new PM_Managementt();
			pm.Access();
			break;

		case 3:
			Contractor conc = new Contractor();
			conc.concSwitch();
			break;

		case 4:
			viewer vw = new viewer();
			vw.showViewer();
			vw.viewSwitch();			
            break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice \n");

			break;
		}

	}

}
