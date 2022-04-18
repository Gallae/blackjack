/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author Yusen
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Blackjack! Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "! Let's play!");
        System.out.println("Your goal is to get as close to 21 as possible without going over.");
        System.out.println("You will be dealt two cards.");
        System.out.println("If you go over 21, you lose.");
        System.out.println("If you get 21, you win.");
        System.out.println("If you get a higher score than the dealer, you win.");
        try{
            do {
                PlayGame playGame = new PlayGame(name);
                playGame.play();
                System.out.println("Do you want to play again? (y/n)");
                String answer = scanner.nextLine();
                if (answer.equals("n") || answer.equals("N")) {
                    playAgain = false;
                }
            } while (playAgain);
        } catch(Exception err){
            System.out.println("Invalid value passed. For safety reason, will shut program down, please try again.");
            System.exit(1);
        }
         
    }
    
}
