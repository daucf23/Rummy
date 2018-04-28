/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import core.Cards;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author justi_000
 */
public class ComputerUI extends JPanel {
    
    private ArrayList<JToggleButton> cards;
    private CardListener cardListener;
    private GridBagLayout gridBagLayout;
    private GridBagConstraints constraints;
    private ImageIcon cardImage;
    private JLabel playerName;
    private JLabel playerScore;
    
    //Override default no-argument constructor

    /**
     *
     */
        public ComputerUI(){
        
        //Call method initComponents
        initComponents();
        
    }
    
    //Define method initComponents

    /**
     *
     */
        public void initComponents(){
        
        //Instantiate an instance of member variables
  
        //lowerUI = new LowerSectionUI();
       // upperUI = new UpperSectionUI();
        
       // layout manager
        gridBagLayout = new GridBagLayout();
        constraints = new GridBagConstraints();
        
        
        
        
        // setting up JPanel
        this.setLayout(gridBagLayout);        
        this.setMinimumSize(new Dimension(625, 200));
        this.setPreferredSize(new Dimension(625, 200));
        this.setMaximumSize(new Dimension(625, 200));
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.setBackground(new Color(34,139,34));
        
        
        JPanel com = new JPanel();
        com.setMinimumSize(new Dimension(150, 50));
        com.setPreferredSize(new Dimension(150, 50));
        com.setMaximumSize(new Dimension(150, 50));
        com.setBorder(BorderFactory.createRaisedBevelBorder());
        com.setBackground(new Color(34,139,34));
        
        
        playerName = new JLabel();
        playerName.setText("Computer            0");
        playerName.setMinimumSize(new Dimension(100, 50));
        playerName.setPreferredSize(new Dimension(100, 50));
        playerName.setMaximumSize(new Dimension(100, 50));
        
        playerScore = new JLabel();
        playerScore.setText(String.valueOf(0));
        playerScore.setMinimumSize(new Dimension(100, 50));
        playerScore.setPreferredSize(new Dimension(100, 50));
        playerScore.setMaximumSize(new Dimension(100, 50));
        
            
        addComponent(0, 10, 0, 0, this, com);
        
        com.add(playerName);
        
        //this.add(playerScore);
        
        cards = new ArrayList<JToggleButton>();
        
        cardListener = new CardListener();
      
        // creating the dice buttons
        for(int i = 0; i < 10; i++)
        {
            JToggleButton card = new JToggleButton();
            card.setMinimumSize(new Dimension(55, 60));
            card.setPreferredSize(new Dimension(55, 60));
            card.setMaximumSize(new Dimension(55, 60));
            card.setAlignmentX(Component.CENTER_ALIGNMENT);            
            card.putClientProperty("card", (i + 1 ));
            card.putClientProperty("value", (i + 1));
            card.putClientProperty("selected", false);
            card.addActionListener(cardListener);
            addImage(card);
            cards.add(card);
            addComponent(i, 1, 1, 1, this, card);        
        }
        
        // creating the roll button
       /* roll = new JButton("Shuffle \nDice");
        roll.setMinimumSize(new Dimension(100, 100));
        roll.setPreferredSize(new Dimension(100, 100));
        roll.setMaximumSize(new Dimension(100, 100));
        roll.setFont(new Font("Serif", Font.BOLD, 16));
        roll.addActionListener(new RollListener());
        
        addComponent(0, 7, 1, 1, this, roll);        */
    }
    
    // method for adding the images to the dice buttons
     private void addImage(JToggleButton card)
    {
        int value = (int)(Math.random() * 52 + 1);

        switch(value)
        {
            case 1:
                cardImage = new ImageIcon( getClass().getResource("../images/1.png"));
                break;
            case 2:
                cardImage = new ImageIcon( getClass().getResource("../images/2.png"));
                break;
            case 3:
                cardImage = new ImageIcon( getClass().getResource("../images/3.png"));
                break;
            case 4:
                cardImage = new ImageIcon( getClass().getResource("../images/4.png"));
                break;
            case 5:
                cardImage = new ImageIcon( getClass().getResource("../images/5.png"));
                break;
            case 6:
                cardImage = new ImageIcon( getClass().getResource("../images/6.png"));
                break;
            case 7:
                cardImage = new ImageIcon( getClass().getResource("../images/7.png"));
                break;
            case 8:
                cardImage = new ImageIcon( getClass().getResource("../images/8.png"));
                break;
            case 9:
                cardImage = new ImageIcon( getClass().getResource("../images/9.png"));
                break;
            case 10:
                cardImage = new ImageIcon( getClass().getResource("../images/10.png"));
                break;  
            case 11:
                cardImage = new ImageIcon( getClass().getResource("../images/11.png"));
                break;
            case 12:
                cardImage = new ImageIcon( getClass().getResource("../images/12.png"));
                break;    
            case 13:
                cardImage = new ImageIcon( getClass().getResource("../images/13.png"));
                break;    
            case 14:
                cardImage = new ImageIcon( getClass().getResource("../images/14.png"));
                break;    
            case 15:
                cardImage = new ImageIcon( getClass().getResource("../images/15.png"));
                break;    
            case 16:
                cardImage = new ImageIcon( getClass().getResource("../images/16.png"));
                break;
            case 17:
                cardImage = new ImageIcon( getClass().getResource("../images/17.png"));
                break;    
            case 18:
                cardImage = new ImageIcon( getClass().getResource("../images/18.png"));
                break;    
            case 19:
                cardImage = new ImageIcon( getClass().getResource("../images/19.png"));
                break;    
            case 20:
                cardImage = new ImageIcon( getClass().getResource("../images/20.png"));
                break;
            case 21:
                cardImage = new ImageIcon( getClass().getResource("../images/21.png"));
                break;
            case 22:
                cardImage = new ImageIcon( getClass().getResource("../images/22.png"));
                break;             
            case 23:
                cardImage = new ImageIcon( getClass().getResource("../images/23.png"));
                break;
            case 24:
                cardImage = new ImageIcon( getClass().getResource("../images/24.png"));
                break;
            case 25:
                cardImage = new ImageIcon( getClass().getResource("../images/25.png"));
                break;
            case 26:
                cardImage = new ImageIcon( getClass().getResource("../images/26.png"));
                break;
            case 27:
                cardImage = new ImageIcon( getClass().getResource("../images/27.png"));
                break;
            case 28:
                cardImage = new ImageIcon( getClass().getResource("../images/28.png"));
                break;
            case 29:
                cardImage = new ImageIcon( getClass().getResource("../images/29.png"));
                break;
            case 30:
                cardImage = new ImageIcon( getClass().getResource("../images/30.png"));
                break;  
            case 31:
                cardImage = new ImageIcon( getClass().getResource("../images/31.png"));
                break;
            case 32:
                cardImage = new ImageIcon( getClass().getResource("../images/32.png"));
                break;    
            case 33:
                cardImage = new ImageIcon( getClass().getResource("../images/33.png"));
                break;    
            case 34:
                cardImage = new ImageIcon( getClass().getResource("../images/34.png"));
                break;    
            case 35:
                cardImage = new ImageIcon( getClass().getResource("../images/35.png"));
                break;    
            case 36:
                cardImage = new ImageIcon( getClass().getResource("../images/36.png"));
                break;
            case 37:
                cardImage = new ImageIcon( getClass().getResource("../images/37.png"));
                break;    
            case 38:
                cardImage = new ImageIcon( getClass().getResource("../images/38.png"));
                break;    
            case 39:
                cardImage = new ImageIcon( getClass().getResource("../images/39.png"));
                break;  
            case 40:
                cardImage = new ImageIcon( getClass().getResource("../images/40.png"));
                break;
            case 41:
                cardImage = new ImageIcon( getClass().getResource("../images/41.png"));
                break;
            case 42:
                cardImage = new ImageIcon( getClass().getResource("../images/42.png"));
                break;             
            case 43:
                cardImage = new ImageIcon( getClass().getResource("../images/43.png"));
                break;
            case 44:
                cardImage = new ImageIcon( getClass().getResource("../images/44.png"));
                break;
            case 45:
                cardImage = new ImageIcon( getClass().getResource("../images/45.png"));
                break;
            case 46:
                cardImage = new ImageIcon( getClass().getResource("../images/46.png"));
                break;
            case 47:
                cardImage = new ImageIcon( getClass().getResource("../images/47.png"));
                break;
            case 48:
                cardImage = new ImageIcon( getClass().getResource("../images/48.png"));
                break;
            case 49:
                cardImage = new ImageIcon( getClass().getResource("../images/49.png"));
                break;
            case 50:
                cardImage = new ImageIcon( getClass().getResource("../images/50.png"));
                break;  
            case 51:
                cardImage = new ImageIcon( getClass().getResource("../images/51.png"));
                break;
            case 52:
                cardImage = new ImageIcon( getClass().getResource("../images/52.png"));
                break;  
        }
        
        cardImage = imageResize(cardImage);
        card.setIcon(cardImage);
    }
    
    // X is the column
    // Y is the row
    // W is the width in cells
    // H is the height in cells
    // aContainer is the container the component is added to
    // aComponent is the component being added to the container
    private void addComponent( int x, int y, int w, int h, 
                               Container aContainer, Component aComponent )  
    {  
        constraints.gridx = x;  
        constraints.gridy = y;  
        constraints.gridwidth = w;  
        constraints.gridheight = h;
        
        if(y == 7)
        {
            constraints.insets = new Insets(8, 8, 8, 8);
        }
        else
        {
            constraints.insets = new Insets(3, 3, 3, 3);
        }
        
        gridBagLayout.setConstraints( aComponent, constraints );  
        aContainer.add( aComponent );  
    } 
    
    // method to resize the image to fit on the jbutton
    private ImageIcon imageResize(ImageIcon icon)
    {
        Image image = icon.getImage();
        Image newImage = 
               image.getScaledInstance(55, 60, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        return icon;
    }
    
    /**
     *
     * @param cardData
     */
    public void setCards(ArrayList<Cards> cardData)
    {
        int index = 0;
        for(JToggleButton card : cards)
        {
            card.putClientProperty("value", cardData.get(index).getFaceValue());
            addImage(card);
            index++;
        }
    }

    private class CardListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            int card = 0;
            int value = 0;
            boolean selected = false;

            if(ae.getSource() instanceof JToggleButton)
            {
                JToggleButton button = (JToggleButton)ae.getSource();
                card = (int)button.getClientProperty("card");
                value = (int)button.getClientProperty("value"); 
                selected = button.isSelected();
                
                if(selected)
                {
                    button.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                    button.putClientProperty("selected", true);
                }
                else
                {
                    button.setBorder(BorderFactory.createLineBorder(null));                
                    button.putClientProperty("selected", false);
                }
            }            
        }        
    }

    
    
    public void setPlayerName(String name) {
        
        playerName.setText(name);
        
    }
    
        
    }

 

