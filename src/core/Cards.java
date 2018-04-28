/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Random;

/**
 *
 * @author justi_000
 */
public class Cards {
    
    private int faceValue;

    /**
     * @return the faceValue
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * @param faceValue the faceValue to set
     */
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    /**
     *Define method rollDie
     */
        public void shuffleCards(){
    
    //Instantiate an instance of class Random
    Random random = new Random();
    
    faceValue = 1 + random.nextInt(53);
    
            }
    
    /**
     * Override method toString
     * @return
     */
    @Override
    public String toString(){
       
        return Integer.toString(getFaceValue());
        
         }    
    
}

