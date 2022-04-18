/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author Yusen
 */
public abstract class Game {
    private String name;
    
    public Game(String name){
        this.name = name;
    }
    
    public abstract void play();


    public abstract boolean checkWinner(int playerScore, int dealerScore);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
