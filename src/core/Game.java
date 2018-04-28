/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import userInterface.RummyUI;

/**
 *
 * @author justi_000
 */
public class Game 
{
    private int gameTurn;
    private ArrayList<Player> players = new ArrayList<Player>();
    private RummyUI rummyUI;
    

    /**
     *
     * @param ui
     */
        public Game(RummyUI ui)
    {
        rummyUI  = ui;

        // get number of players
        int numPlayers = Integer.parseInt(JOptionPane.showInputDialog("How many players for this game? "));
        // initialize game turns to 0
        setGameTurn(0);
        // loop through number of players and create the objects
        for(int i = 0; i < numPlayers; i++)
        {
            // call method to create the new player
            newPlayer();
        }   
        JOptionPane.showMessageDialog(null, "Let's play Rummy!");
    }
    
    /**
     * @return the gameTurn
     */
    public int getGameTurn() 
    {
        return gameTurn;
    }

    /**
     * @param gameTurn the gameTurn to set
     */
    public void setGameTurn(int gameTurn) 
    {
        this.gameTurn = gameTurn;
    }

    /**
     * @return the players
     */
    public ArrayList<Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(ArrayList<Player> players) 
    {
        this.players = players;
    }
    
    private void newPlayer()
    {
        // prompt the user for the player name
        String data = JOptionPane.showInputDialog("Enter player's name: ");
        // create a new Player with data
        Player player = new Player();
        // set the name member variable to the data read in
        player.setName(data);
        // add the player 
        players.add(player);
    }

    /**
     * Display Players
     */
    public void displayPlayers()
    {
        System.out.println("Players for this game are: ");

        // loop through players and display information
        for(Player player : players)
        {
            System.out.println(player.getName());
        }
    }
    
    /**
     * Play the game
     */
    public void playGame()
    {
            for(Player player : players)
            {
                player.setFinished(false);
                
                JOptionPane.showMessageDialog(null, player.getName() + " draw a card");
                
                while(!player.isFinished())
                {
                    rummyUI.getNameUI().setPlayerName(player.getName());
                    rummyUI.getPlayerUI().setPlayer(player);
                  
                }
                
                player.setFinished(false);
            }
        }
    
}
