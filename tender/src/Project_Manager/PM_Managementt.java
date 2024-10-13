package Project_Manager;
import java.util.Scanner;
public class PM_Managementt extends ProjectManager {
    public void Access(){
        PM_Managementt b = new PM_Managementt();
        int x = b.pmSwitch();
        PMmanages(x, b);
    }
    public void PMmanages(int x , PM_Managementt b){
        Scanner sc = new Scanner(System.in);
        switch(x){
            case 1: //view assigned tenders
            System.out.println("Viewed Assigned Tender: ");
            System.out.println("1.Go back\n 2.Logout");
            int m = sc.nextInt();
                        if (m ==1 ){
                            b.PMmanages(x,b);
                        }
                        else{
                            b.PMMainSwitch();
                        }
            break;
            //tender.details and contractor.details
            
            case 2: // view received resumes of the contractors
            System.out.println(" The received bids of the contractor with their resumes:");
            //method
            System.out.println("1.Go back\n 2.Logout");
            int n = sc.nextInt();
                        if (n ==1 ){
                            b.PMmanages(x, b);
                        }
                        else{
                            b.PMMainSwitch();
                        }
            break;
            //contractor.details
    
            case 3:
            System.out.println("Finding the best bidder :");
            System.out.println("1.Go back\n 2.Logout");
            int o  = sc.nextInt();
                        if (o ==1 ){
                            b.PMmanages(x, b);
                        }
                        else{
                            b.PMMainSwitch();
                        }
            break;
            //sort the bidders and display the top bidders
            case 4:
            System.out.println("File COmplaints");
            System.out.println("1.Go back\n 2.Logout");
            int p = sc.nextInt();
                        if (p ==1 ){
                            b.PMmanages(x, b);
                        }
                        else{
                            b.PMMainSwitch();
                        }
             break;
            case 5:
               System.out.println("View Contractors");
               System.out.println("1.Go back\n 2.Logout");
               int q = sc.nextInt();
                           if (q ==1 ){
                            b.PMmanages(x, b);
                           }
                           else{
                               b.PMMainSwitch();
                           }
               break;
            case 6:
               b.PMMainSwitch();
               break;
    
    
            default:
                    break;
            }
            
        
        }
    
    
}
