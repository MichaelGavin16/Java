/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SteppingStones;

import java.util.Scanner;

/**
 *
 * @author Gavins
 */
public class Ingredient {
    private String nameOfIngredient;  //sting to input ingredients
    private String measurement; //string to input units of measurement
    private float unitAmount; // float to save memory 
    private int numberCaloriesPerUnit; //integer for literal
    private double totalCalories; // double because may be a larger number
    
     /**
     *
     * @param args
     */
	
    public static void main(String[] args) {  
       String nameOfIngredient = "";
       String measurement = "";
       float unitAmount = 0;
       int numberCaloriesPerUnit = 0;
       double totalCalories = 0.0;      
       
       Scanner scnr = new Scanner(System.in);
       
       
       //Will prompt the user to begin
       
       System.out.println("Please enter the name of the ingredient: ");
       nameOfIngredient = scnr.next();
       
       //Will have user enter what measurement they will use
       
       System.out.println("Please Enter the Unit of Measurement for this Ingredient: (cups/ tsp/ etc): ");
       measurement = scnr.next();
       
       //Will enter the amount needed
       
       System.out.println("Please enter the number of " + measurement + " of " + nameOfIngredient + " we'll need(between 1 and 100): ");
       unitAmount = scnr.nextFloat();
       
       //will place a limit on the amount of units
       
              if ((unitAmount < 1) || (unitAmount > 100)) {
               System.out.println(unitAmount + " is not valid!");
               System.out.println("Please enter the number of " + measurement + " of " + nameOfIngredient + " we'll need(between 1 and 100): ");
               unitAmount = scnr.nextFloat();
               if ((unitAmount < 1) || (unitAmount > 100)) {
                   System.out.println(unitAmount + " is not valid. You are out of attempts.");
                   
                   //the user will need to start over if input is invalid
                   // if input is valid, will enter number of calories
               }
               else {
                   System.out.println("Please enter the name of calories per " + measurement + ": ");
       numberCaloriesPerUnit = scnr.nextInt();
       
       totalCalories = unitAmount * numberCaloriesPerUnit;
       
       System.out.println(nameOfIngredient + " uses " + unitAmount + " " + measurement + " and has " + totalCalories + " calories.");
               }
               
               // Redid the above code to complete the outer loop
           } 
           else {
          
       
       System.out.println("Please enter the name of calories per " + measurement + ": ");
       numberCaloriesPerUnit = scnr.nextInt();
       
       totalCalories = unitAmount * numberCaloriesPerUnit;
       
       System.out.println(nameOfIngredient + " uses " + unitAmount + " " + measurement + " and has " + totalCalories + " calories.");
       
    }
    
}
}
    