package Administrator;
import java.io.IOException;
import java.util.Scanner;
public class adminManagement extends admin {
    public void Access() {
        adminManagement a = new adminManagement();
        Scanner sc = new Scanner(System.in);
    
        int i = a.adminSwitch();
        manages(i, a);
        
    }
    public void manages( int i,adminManagement a) {
        Scanner sc = new Scanner(System.in);
        switch(i){
            case 1:
            System.out.println(" 1.Add Tenders \n 2.Delete Tenders \n 3.View Tenders \n 4.Go Back\n ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    // .addTender
                    System.out.println(".addTender Action Done.");
                    System.out.println("1.Go back\n 2.Logout");
                    int m = sc.nextInt();
                    if (m ==1 ){
                        a.manages(i, a);
                    }
                    else{
                        a.ADMainSwitch();
                    }
                    break;
                case 2:
                    // .deleteTender
                    System.out.println("deleteTender Action Done.");
                    System.out.println("1.Go back \n2.Logout");
                    int n = sc.nextInt();
                    if (n ==1 ){
                        a.manages(i, a);
                    }
                    else{
                        a.ADMainSwitch();
                    }
                    break;
                case 3:
                    // viewTender
                    System.out.println("viewTender Action Done.");
                    System.out.println("1.Go back \n2.Logout");
                    int o = sc.nextInt();
                    if (o ==1 ){
                        a.manages(i, a);
                    }
                    else{
                        a.ADMainSwitch();
                    }
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
                    System.out.println(".assign PM Action Done.");
                    System.out.println("1.Go back\n 2.Logout");
                    int m = sc.nextInt();
                    if (m ==1 ){
                        a.manages(2, a);
                    }
                    else{
                        a.ADMainSwitch();
                    }
                    break;
                case 2:
                    // .ViewPMnotassign
                    System.out.println(".View not assigned PM Action Done.");
                    System.out.println("1.Go back\n 2.Logout");
                    int n = sc.nextInt();
                    if (n ==1 ){
                        a.manages(2, a);
                    }
                    else{
                        a.ADMainSwitch();
                    }
                    break;
                case 3:
                    // viewPM
                    System.out.println(".assign PM Action Done.");
                    System.out.println("1.Go back\n 2.Logout");
                    int o = sc.nextInt();
                    if (o ==1 ){
                        a.manages(2, a);
                    }
                    else{
                        a.ADMainSwitch();
                    }
                    break;
                case 4:
                    a.AfterAdmin();
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
                    System.out.println(".get contractors Action Done.");
                    System.out.println("1.Go back\n 2.Logout");
                    int m = sc.nextInt();
                    if (m ==1 ){
                        a.manages(3, a);
                    }
                    else{
                        a.ADMainSwitch();
                    }
                    break;
                case 2:
                    // .overview details
                    System.out.println(".overview details Action Done.");
                    System.out.println("1.Go back\n 2.Logout");
                    int n = sc.nextInt();
                    if (n ==1 ){
                        a.manages(3, a);
                    }
                    else{
                        a.ADMainSwitch();
                    }
                    break;
                case 3:
                    a.AfterAdmin();
                    break;
                default:
                    break;
            }
            case 4:
             System.out.println("Complaint Management.");
             System.out.println(". Done.");
             System.out.println("1.Go back\n 2.Logout");
             int m = sc.nextInt();
             if (m ==1 ){
                 a.AfterAdmin();
             }
             else{
                 a.ADMainSwitch();
             }
             break;
            case 5:
              a.ADMainSwitch();  
              break;
        }
    }
    }
    

    

