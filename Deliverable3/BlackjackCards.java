/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author Yusen
 */
public class BlackjackCards extends Card {
    
	private CardSuit cardSuit;
	private CardValue cardValue;
	
	public BlackjackCards(CardSuit cardSuit, CardValue cardValue){
		this.cardSuit=cardSuit;
		this.cardValue=cardValue;
	}

	public void setCardSuit(CardSuit cardSuit){
		this.cardSuit = cardSuit;
	}

	public CardSuit getCardSuit(){
		return this.cardSuit;
	}

	public void setCardValue(CardValue cardValue){
		this.cardValue = cardValue;
	}

	public CardValue getCardValue(){
		return this.cardValue;
	}

    @Override
    public String toString() {
        return String.valueOf(this.cardSuit)+" "+String.valueOf(this.cardValue);
    }
    
}
