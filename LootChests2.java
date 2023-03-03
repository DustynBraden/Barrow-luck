/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lootchests;
import  java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Dustyn Braden
 */
//This code is for my own usage that I wanted to try out on my own accord.
//It simply just randomizes numbers, when the number hits 1-14, It will say
//I have received a Barrow item. This is my first program, I intend to update
// As I learn more programming, I will add brothers killed? Which barrow item.
// etc.. 
public class LootChests2 {

    public static void main(String[] args) {
        
        System.out.print("Hello, will you be a spoon today? this program"
                         + " will tell you if you will get lucky this run of"
                           + " Barrows");
        System.out.print("\n-----------------------------------------------");
        
        int runAttempt; //How many times you went for another run.
        int gotItem; //this is if you rolled for a Barrows Item that has a
                        // chance at 14/chest looted assuming you killed 
                        // all 8 brothers.
        int maxLoot;
                        //Max number of trys that you are going for in your 
                        //Barrows session. 
        String input;               
        //Keyboard input for when the user will be asked how many times they
        //will run some Barrows.
        Scanner keyboard = new Scanner(System.in);
        
        //This is the random class that will run random numbers for
        // however many times you do a Barrows run. 
        Random rand = new Random();
        while(true){
        System.out.println("\nHow many runs of Barrows we doing my guy? ");
        
        maxLoot = keyboard.nextInt();
        
        for (int count = 0; count < maxLoot; count++)
        {
            gotItem = rand.nextInt();
            if (gotItem <= 1/17)
            {
                System.out.println("Gz! Big Spoon! You got a Item.");
              
            }
         else
            System.out.println("No luck this time.");
        
        
        System.out.println("Do you want to keep grinding?(Y or N): ");

        input = keyboard.next();
        
        if (input.equalsIgnoreCase("N")){
            return;
         
        }
        else {
            System.out.println("\nHow many runs of Barrows we doing  my guy? ");
          maxLoot = keyboard.nextInt();
        }
      
        }
        }
    }
}
         
             


