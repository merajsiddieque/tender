package Viewer;
import FileHandling.FileHandling;
import Main.MainSwitch;
import User.user;
import java.io.IOException;
import java.util.Scanner;
public class viewer extends user
{
	Scanner sc = new Scanner(System.in);
	public void showViewer()
	{
	System.out.println("Enter Your Name ");
	String viewerName = sc.nextLine();
	System.out.println("Welcome "+ viewerName + "!");
	}
	public void afterVW(){
		System.out.println("1.Go Back \n 2. Exit\n");
			int x = sc.nextInt();
			if (x == 1){
                viewSwitch();
			}
			else if(x == 2){
				System.exit(0);
			}
			else{
				System.out.println("Invalid Input ... Try Again.");
				afterVW();
			}
	}

	public void viewSwitch()

	{
		System.out.println(" 1.Previous Tenders\n 2.Active Filed Tenders\n 3. Upcoming Tenders \n4.Exit\n ");
		int Choice = sc.nextInt();
		FileHandling fh = new FileHandling();
		switch (Choice) 
		{
			
		case 1:	
			fh.viewPreviousRecords();
			afterVW();
			break;
		case 2:
		   fh.viewActiveRecords();
		   afterVW();
			break;
		/*case 3:
			fh.viewUpcomingTenders();
			afterVW();
			 break;	
			 */
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Not Valid Choice ! Try again..Exiting Program.");
		}	
	}
}
