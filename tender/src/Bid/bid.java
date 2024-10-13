package Bid;

public class bid {
    public int bidID;
    public int tenderID;
    private int contractorID;
    private double bidAmount;
    public double rating;
    private void custom_calculate_rating(){
        
    }
    public bid(){
        System.out.println("Bidding Section.");
    }
    public bid(int bidID, int tenderID, int contractorID, double bidAmount) {
        this.bidID = bidID;
        this.tenderID = tenderID;
        this.contractorID = contractorID;
        this.bidAmount = bidAmount;
    }

    public void submitBid() {
        System.out.println("Bid submitted for Tender ID: " + tenderID + " with amount: " + bidAmount);
    }
}
