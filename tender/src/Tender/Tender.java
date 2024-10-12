package Tender;

public class Tender {
    int tenderID;
    String projectTitle;
    double budget;
    String prerequisites; //resume
    String deadline;
    //Contractor assignedContractor;
    //ProjectManager projectManager;
    Tender(){
      System.out.println("Loading Tenders...");
    }
    public Tender(int id, String title, double budget, String prereqs, String deadline) {
        this.tenderID = id;
        this.projectTitle = title;
        this.budget = budget;
        this.prerequisites = prereqs;
        this.deadline = deadline;
    }
    public void get_available_tenders(){
        System.out.println("HI");
    }
    public void getTenderDetails() {
        System.out.println("Tender ID: " + tenderID);
        System.out.println("Project Title: " + projectTitle);
        System.out.println("Budget: " + budget);
        System.out.println("Prerequisites: " + prerequisites);
        System.out.println("Deadline: " + deadline);

    }
    public static Tender[] createSampleTenders() {
        Tender[] tenders = new Tender[10];  // Array of 10 Tender objects
        tenders[0] = new Tender(1, "Build a Bridge", 500000, "Experienced in bridge construction", "2024-12-31");
        tenders[1] = new Tender(2, "Construct Office Building", 1000000, "Office building experience", "2024-11-30");
        tenders[2] = new Tender(3, "Highway Expansion Project", 1500000, "Road construction experience", "2025-03-15");
        tenders[3] = new Tender(4, "Residential Complex Construction", 2000000, "Residential complex projects", "2024-10-20");
        tenders[4] = new Tender(5, "Build a Hospital", 2500000, "Medical building experience", "2025-01-01");
        tenders[5] = new Tender(6, "Water Treatment Plant", 1200000, "Industrial construction experience", "2024-09-30");
        tenders[6] = new Tender(7, "Railway Station Expansion", 3000000, "Railway infrastructure experience", "2025-05-31");
        tenders[7] = new Tender(8, "Airport Terminal Renovation", 3500000, "Aviation sector experience", "2024-12-15");
        tenders[8] = new Tender(9, "Build Public Park", 800000, "Public infrastructure experience", "2024-11-01");
        tenders[9] = new Tender(10, "School Building Project", 600000, "Education sector experience", "2024-10-10");
        
        return tenders;
  }
  
}
