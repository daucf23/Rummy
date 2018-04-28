/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author justi_000
 */
public class NameUI extends JPanel {
    
    //Declare member variables
    private JLabel playerName;
    private JLabel playerScore;
    
    //Override default no-argument constructor

    /**
     *
     */
        public NameUI(){
        
        //Call method initComponents
        initComponents();
        
    }
    
    //Define method initComponents

    /**
     *
     */
        public void initComponents(){
        
        //Create Layout Manager
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
        
        this.setLayout(boxLayout);
        this.setMinimumSize(new Dimension(150, 50));
        this.setPreferredSize(new Dimension(150, 50));
        this.setMaximumSize(new Dimension(150, 50));
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.setBackground(new Color(34,139,34));
        
        playerName = new JLabel();
        playerName.setText("Name");
        playerName.setMinimumSize(new Dimension(100, 50));
        playerName.setPreferredSize(new Dimension(100, 50));
        playerName.setMaximumSize(new Dimension(100, 50));
        
        playerScore = new JLabel();
        playerScore.setText(String.valueOf(0));
        playerScore.setMinimumSize(new Dimension(100, 100));
        playerScore.setPreferredSize(new Dimension(100, 100));
        playerScore.setMaximumSize(new Dimension(100, 100));
        
        
        this.add(playerName);
        
        this.add(playerScore);

    }  
    
    /**
     *
     * @param name
     */
    public void setPlayerName(String name) {
        
        playerName.setText(name);
        
    }
    
}
