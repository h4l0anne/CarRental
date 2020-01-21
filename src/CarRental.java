/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anne
 */

public class CarRental {
    public String renterName; 
    public String zipCode;
    public String carSize;
    public double dailyRentalFee;
    public int daysRented;
    public double totalFee;
    
    
    public CarRental(String renter, String zip, String Csize, int days){
        this.renterName = renter;
        this.zipCode = zip;
        this.carSize = Csize;
        this.daysRented = days;
        
        switch (Csize) {
            case "economy":
                dailyRentalFee = 29.99;
                totalFee = days*dailyRentalFee;
                break;
            case "midsize":
                dailyRentalFee = 38.99;
                totalFee = days*dailyRentalFee;
                break;
            case "fullsize":
                dailyRentalFee = 43.50;
                totalFee = days*dailyRentalFee;
                break;
            default:
                break;
        }
    }

    /**
     *
     */
    public void display(){
        System.out.println("The daily rate and total fee are calculated based on size: \n"
                + "economy = $29.99 per day\n"
                + "midsize = $38.99 per day\n"
                + "fullsize = $43.50 per day\n"
                + "Dear " + renterName + ", your rental is confirmed for " + carSize + " and will be waiting at " + zipCode + "\n"
                + "Total rental fee: $" + totalFee + " for " + daysRented + " days."
                        );
    }
}

