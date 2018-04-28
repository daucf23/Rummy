/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import userInterface.PlayerUI;

/**
 *
 * @author justi_000
 */
public class Shuffle {
    
    private ArrayList<Cards> cards = new ArrayList<Cards>();
    private PlayerUI rollUI;

    /**
     * @return the dice
     */
    public ArrayList<Cards> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Cards> cards) {
        this.cards = cards;
    }
    
    //Override the no argument constructor Shuffle

    /**
     *
     */
        public Shuffle(){
        
        initializeDice();
    }
    
    //Define method initializeDice

    /**
     *
     */
        public void initializeDice(){
        
        //Loop through five times
        for(int i=0; i< 10; i++){
            
            //Instantiate an instance of class Cards
            Cards die = new Cards();
            
            //Add the instance of Cards to member variable die
            cards.add(die);
            
        }      
   
    }
    
        public void shuffleCards(){
        
        int counter = 0;
        
        //Loop through member variable cards
        for (Cards card : cards){
            
            counter ++;
            card.shuffleCards();
            
            System.out.print("Card drawn is ");
            System.out.println(card.toString());
            
        }
        
    }
    
}
