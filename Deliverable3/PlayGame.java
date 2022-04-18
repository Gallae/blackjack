/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

//import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

import java.util.Scanner;

/**
 *
 * @author Yusen
 */
public class PlayGame extends Game{



    public PlayGame(String player) {
        super(player);

    }

    @Override
    public void play(){
        //declare variables
        Scanner input = new Scanner(System.in);
        
        GroupOfCards groupOfCards = new GroupOfCards();
        groupOfCards.generateCard();
        int playerCardValue = 0;
        int dealerCardValue = 0;
        boolean gameNotOver = true;
        //give starting cards to player and dealer
        playerCardValue += groupOfCards.draw();
        playerCardValue += groupOfCards.draw();
        System.out.println("Your card value is " + playerCardValue);

        dealerCardValue += groupOfCards.draw();
        dealerCardValue += groupOfCards.draw();

        while (gameNotOver) {
            if (playerCardValue == 21) {
                System.out.println("You win");
                gameNotOver = false;
                break;
            } else if (playerCardValue > 21) {
                System.out.println("You lose");
                gameNotOver = false;
                break;
            }
            System.out.println("Hit or stand?");
            System.out.println("1. Hit");
            System.out.println("2. Stand");
            int answer = 0;
            while (answer != 1 && answer != 2) {
                System.out.println("Please enter 1 or 2");
                answer = input.nextInt();
            }
            if (answer == 1) {
                playerCardValue += groupOfCards.draw();
                System.out.println("Your card value is " + playerCardValue);
            } else {
                System.out.println("Your card value is " + playerCardValue);
                while (dealerCardValue < 17) {
                    dealerCardValue += groupOfCards.draw();
                }
                gameNotOver = checkWinner(playerCardValue, dealerCardValue);
                break;
            }

        }
    }

    @Override
    public boolean checkWinner(int playerCardValue, int dealerCardValue) {
        System.out.println("Dealer's card value is " + dealerCardValue);

        if (dealerCardValue > 21) {
            System.out.println("Dealer lose");
            return false;
        } else if (dealerCardValue == 21) {
            System.out.println("Dealer win");
            return false;
        } else {
            if (playerCardValue == dealerCardValue) {
                System.out.println("It's a tie");
                return false;
            } else if (playerCardValue > dealerCardValue) {
                System.out.println("You win");
                return false;
            } else {
                System.out.println("Dealer win");
            }
        }
        return true;
    }
}
