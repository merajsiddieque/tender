package Bid;

public class bid {
    int bidID;
    int tenderID;
    int contractorID;
    double bidAmount;
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
