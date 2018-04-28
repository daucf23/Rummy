/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author justi_000
 */
public class Player 
{
    private String name;
    private Shuffle shuffle;
    private int shuffleCount;
    
    private boolean finished = false;

    /**
     * Override default constructor 
     */
    public Player()
    {
        // initialize the Roll object for the player
        // use this single reference for the game
        shuffle = new Shuffle();

    }
    
    /**
     *
     * @return
     */
    public Shuffle getShuffle() 
    {
        return shuffle;
    }

    /**
     *
     * @param shuffle
     */
    public void setShuffle(Shuffle shuffle) 
    {
        this.shuffle = shuffle;
    }

    /**
     *
     * @return
     */
    public String getName() 
    {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) 
    {
        this.name = name;
    }
    
    /**
     *
     */
    public void incrementRoll()
    {
        // call Roll's rollDice() method
        if(shuffleCount < 3)
        {
            finished = false;
            shuffleCount++;
        }
        else
        {
            shuffleCount = 0;
            finished = true;
        }           
    }
    
    /**
     *
     */
    public void shuffleCards()
    {
        // call Roll's rollDice() method
        if(shuffleCount < 3)
        {
            finished = false;
            shuffle.shuffleCards();
            shuffleCount++;
        }
        else
        {
            shuffleCount = 0;
            finished = true;
        }   
    }

    /**
     * @return the finished
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * @param finished the finished to set
     */
    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    
}