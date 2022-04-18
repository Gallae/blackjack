/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author Yusen
 */
public class GroupOfCards {
    private ArrayList<BlackjackCards> deck = new ArrayList<BlackjackCards>();


    public void generateCard(){
        int cardIndex=0;
        for(CardSuit suit: CardSuit.values()) {
            for(CardValue value: CardValue.values() )
            {
                deck.add(new BlackjackCards(suit,value));
            }
        }
    }

    public int draw(){
        int cardIndex = (int)(Math.random()*deck.size());
        int temp = deck.get(cardIndex).getCardValue().cardValue;
        deck.remove(cardIndex);
        return temp;
    }
    
    public ArrayList<BlackjackCards> getCards(){
        return this.deck;
    }
}
