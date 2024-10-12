package Project_Manager;
import java.util.Scanner;
public class PM_Managementt extends ProjectManager {
    public void Access(){
        Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    switch(x){
        case 1: //view assigned tenders
        System.out.println("Assigned Tender: ");
        //tender.details and contractor.details
        
        case 2: // view received resumes of the contractors
        System.out.println(" The received bids of the contractor with their resumes:");
        //contractor.details

        case 3:
        System.out.println("Finding the best bidder :");
        //sort the bidders and display the top bidders  


        default:
                break;
        }
        
    
    }
}
