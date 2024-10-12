package Administrator;
import java.util.Scanner;
public class adminManagement extends admin {
    public void Access(){
        adminManagement a = new adminManagement();
        Scanner sc = new Scanner(System.in);
    
        int i = a.adminSwitch();
        manages(i, a);
        
    }
    public void manages( int i,adminManagement a){
        Scanner sc = new Scanner(System.in);
        switch(i){
            case 1:
            System.out.println(" 1.Add Tenders \n 2.Delete Tenders \n 3.View Tenders \n 4.Go Back\n ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    // .addTender
                    break;
                case 2:
                    // .deleteTender
                    break;
                case 3:
                    // viewTender
                    break;
                case 4:
                    a.AfterAdmin();
                    break;    	
                default:
                    break;
            }
            case 2:
            System.out.println(" 1.Assign Project Managers to Tenders \n 2.View Not assigned PM Tenders \n 3.View Pm \n 4. Go back\n");
            int y = sc.nextInt();
            switch (y) {
                case 1:
                    // .assignPM
                    break;
                case 2:
                    // .ViewPMnotassign
                    break;
                case 3:
                    // viewPM
                    break;
                case 4:
                  a.manages(i, a);
                  break;    
                default:
                    break;
            }
            case 3:
            System.out.println(" 1.Overview Contractors \n 2.Overview Contractor Details \n 3. Go Back \n ");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    // .getContractors
                    break;
                case 2:
                    // .overview details
                    break;
                case 3:
                    a.manages(i, a);
                    break;
                default:
                    break;
            }
            case 4:
             System.out.println("Complaint Management.");
             break;
            case 5:
              a.ADMainSwitch();  
              break;
        }
    }
    }
    

    

