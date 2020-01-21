/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anne
 */
import java.util.Scanner;

public class LuxuryCarRental extends CarRental {
    
    public LuxuryCarRental(String renter, String zip, String Csize, int days){
        super(renter, zip, Csize, days);
    }

    @Override  
    public void display(){
        System.out.println("The daily rental fee for a Luxury Car is:$79.99 per day\n");
        String answer; //declaring a string variable to hold the input value
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want a chauffeur? Additional cost will be $200 per day.(Type Y/N)");
        answer = input.nextLine(); //Read user input
        if (answer.equals("Y") || answer.equals("y")){
            dailyRentalFee = 79.99;
            totalFee = daysRented*dailyRentalFee + 200;
            System.out.println("Chauffeur is included in the package at an additional cost of $200.");
            System.out.println("Dear " + renterName + ", your rental is confirmed for " + carSize + " and will be waiting at " + zipCode + "\n"
                + "Total rental fee: $" + totalFee + " for " + daysRented + " days.");
        }
        else if (answer.equals("N") || answer.equals("n")){
            System.out.println("Chauffeur is not included.");
            dailyRentalFee = 79.99;
            totalFee = daysRented*dailyRentalFee;
            System.out.println("Dear " + renterName + ", your rental is confirmed for " + carSize + " and will be waiting at " + zipCode + "\n"
                + "Total rental fee: $" + totalFee + " for " + daysRented + " days.");
        }
        else
        {
            System.out.println("Invalid input.");
        }
    }
}
