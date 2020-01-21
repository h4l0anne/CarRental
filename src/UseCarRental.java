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

public class UseCarRental {
    
    public static void main (String args[]){
 
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Do you want "
            + "1) economy?\n"
            + "2) midsize\n"
            + "3) fullsize\n"
            + "4) Luxury?");
    int userAnswer = userInput.nextInt();
    System.out.println("How many days do you want to rent?");
    userInput.nextLine(); //if you dont have this it wont clear the \n character from entering the single digit
    int userAnswer1 = userInput.nextInt();
    System.out.println("Enter your first and last name:");
    userInput.nextLine(); //if you dont have this it wont clear the \n character from entering the single digit
    String name = userInput.nextLine();
    System.out.println("Enter your Zip:");
    //userInput.nextLine(); //if you dont have this it wont clear the \n character from entering the single digit
    String zipCode = userInput.nextLine();
    
    
    if (userAnswer == 1){
        System.out.println("economy = $29.99 per day");
        CarRental rent1 = new CarRental(name, zipCode, "economy",userAnswer1);
        rent1.display();
    }
    if (userAnswer == 2){
        System.out.println("midsize = $38.99 per day");
        CarRental rent1 = new CarRental(name, zipCode, "midsize",userAnswer1);
        rent1.display();
    }
    if (userAnswer == 3){
        System.out.println("fullsize = $43.50 per day");
        CarRental rent1 = new CarRental(name, zipCode, "fullsize",userAnswer1);
        rent1.display();
    }
    if (userAnswer == 4){
        LuxuryCarRental rent1 = new LuxuryCarRental(name, zipCode, "Luxury",userAnswer1);
        rent1.display();
    }
    
}
}