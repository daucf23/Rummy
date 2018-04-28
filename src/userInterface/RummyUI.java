/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import core.Game;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author justi_000
 */
public class RummyUI {
    
    //Declare member variables
    private NameUI nameUI;
    private PlayerUI playerUI; 
    private ComputerUI computerUI;
    private CenterUI centerUI;
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu game;
    private JMenu rulesMenu;
    private JMenuItem exit;
    private JMenuItem newGame;
    private JMenuItem rules;
    private JPanel playerPanel;
    private JPanel leftPanel;
    private Game theGame;
    
    //Event handlers
    private MenuListener menuListener;
    
    //Override default no-argument constructor
    public RummyUI(){
        
        //Call method initComponents
        initComponents();
        
    }
    
     //Define method initComponents
    public void initComponents(){

        //Instantiate an instance of member variables
        nameUI = new NameUI();
        playerUI = new PlayerUI();
        computerUI = new ComputerUI();
        centerUI = new CenterUI();
       
        frame = new JFrame();
        playerPanel = new JPanel();
        leftPanel = new JPanel();
      
        menuListener = new MenuListener();
        
        //Add UI components 
        //Create frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Rummy");
        frame.setMinimumSize(new Dimension(725, 725));
        frame.setPreferredSize(new Dimension(725, 725));
        frame.setMaximumSize(new Dimension(725, 725));
    
        //Call method createMenu
        createMenu();
        
        rulesMenu();
        
        frame.setJMenuBar(menuBar);
        
        setNameUI(new NameUI());      
        setPlayerUI(new PlayerUI());
       
        playerPanel.setMinimumSize(new Dimension(700, 250));
        playerPanel.setPreferredSize(new Dimension(700, 250));
        playerPanel.setMaximumSize(new Dimension(700, 250));
        playerPanel.add(getNameUI());
        playerPanel.add(getPlayerUI());
        playerPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        playerPanel.setBackground(new Color(34,139,34));
        
        theGame = new Game(this);
        
        /*leftPanel.setMinimumSize(new Dimension(250, 700));
        leftPanel.setPreferredSize(new Dimension(250, 700));
        leftPanel.setMaximumSize(new Dimension(250, 700));
        leftPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        leftPanel.setBackground(Color.red);
  */
        setComputerUI(new ComputerUI());
        setCenterUI(new CenterUI());
        
        
        
        
        frame.add(playerPanel, BorderLayout.SOUTH);
        //frame.add(leftPanel, BorderLayout.CENTER);
        
        frame.add(getComputerUI(), BorderLayout.NORTH);
        frame.add(getCenterUI(), BorderLayout.CENTER);
        
        frame.setVisible(true);
        
        startGame();

    }
    
    //Define method to create the menu
    private void createMenu(){
        
        menuBar = new JMenuBar();
        
        game = new JMenu("Rummy");
        game.setMnemonic('R');
        
        newGame = new JMenuItem("New Game");
        newGame.setMnemonic('N');
        newGame.addActionListener(menuListener);
        
       
        
        exit = new JMenuItem("Exit");
        exit.setMnemonic('E');
        exit.addActionListener(menuListener);     
    
        
        
        //menuBar.add(game);
        
    }
    
    private void rulesMenu(){
        
        menuBar = new JMenuBar();
        
        rulesMenu = new JMenu("Rules");
        rulesMenu.setMnemonic('R');
 
        rules = new JMenuItem("Rules");
        rules.setMnemonic('R');
        rules.addActionListener(menuListener);     
        
        game.add(newGame);
        game.add(exit);
        
        rulesMenu.add(rules);
        
        menuBar.add(game);
        menuBar.add(rulesMenu);
        
        
    }
    
    
    
    private void resetUI(){
       
     
      
   }
    
   private void startGame(){
       
       theGame.playGame();
       
   }
   
   /*
     * @return the nameUI
     */
    public NameUI getNameUI() {
        return nameUI;
    }

    /**
     * @param nameUI the nameUI to set
     */
    public void setNameUI(NameUI nameUI) {
        this.nameUI = nameUI;
    }

    /**
     * @return the playerUI
     */
    public PlayerUI getPlayerUI() {
        return playerUI;
    }

    /**
     * @param playerUI the playerUI to set
     */
    public void setPlayerUI(PlayerUI playerUI) {
        this.playerUI = playerUI;
    }

    /**
     * @return the computerUI
     */
   public ComputerUI getComputerUI() {
        return computerUI;
   }
    
     /**
     * @param computerUI the computerUI to set
     */
   public void setComputerUI(ComputerUI computerUI) {
       this.computerUI = computerUI;
    }

  

    private CenterUI getCenterUI() {
       return centerUI;
    }

    private void setCenterUI(CenterUI centerUI) {
        this.centerUI = centerUI;
        
    }

    
    //Creat action listener class MenuListener for the menu
     private class MenuListener implements ActionListener
    {
        
        //Create action event method
        //Runs if one of the buttons is clicked
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            
            int result = 0;
            
            if(ae.getSource() instanceof JMenuItem){
                
                //If user selects exit option, the program will exit
                if(ae.getActionCommand().equals("Exit"))
                    System.exit(0);
                //Gives user option to start new game
                 if(ae.getActionCommand().equals("New Game")){
                    result = JOptionPane.showConfirmDialog(null, "Are you sure?");
            
                    if(result == JOptionPane.YES_OPTION)
                    {
                        // reset the game
                        resetUI();
                        
                    }
                    }
                //Gives the option to display the rules of the games 
                if(ae.getActionCommand().equals("Rules"))
                   JOptionPane.showMessageDialog(frame, "The aim of rummy is to get rid of all your cards before your opponent does.\n" +
"\n" +
"One standard deck of 52 cards is used for classic rummy. Cards rank from low to high: Ace 2 3 4 5 6 7 8 9 10 Jack Queen King\n" +
"\n" +
"Start your turn by drawing a card from the top of the stock pile or the discard pile.\n" +
"\n" +
"You dispose of cards by building melds which are made up of sets, three or four of a kind and the same rank; or runs, three or more cards in sequence and same suit.\n" +
"\n" +
"An example set is the 7 of diamonds, 7 of hearts and 7 of spades.\n" +
"\n" +
"An example run is the 4 of clubs, 5 of clubs and 6 of clubs.\n" +
"\n" +
"When you have built a set or run it will automatically be taken from your hand and placed on the table.\n" +
"\n" +
"Cards can also be added to the sets and runs which have already been laid down, this is called laying off.\n" +
"\n" +
"You end your turn by discarding one card from your hand onto the discard pile.\n" +
"\n" +
"Once a player has disposed of all of their cards, the other player's cards are scored.\n" +
"\n" +
"Scoring:\n" +
"\n" +
"Face card: 10 points\n" +
"\n" +
"Ace: 1 point\n" +
"\n" +
"All others: face value (4 = 4 points, 9 = 9 points, etc.)\n" +
"\n" +
"Hands will continue to be dealt until one of the players reaches 100 points. The first player to reach 100 points loses the rummy game.");
                
                
                
        }      }
        
    }
    
}
