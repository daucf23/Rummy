/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import core.Cards;
import core.Player;
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

public class CenterUI extends JPanel
{
    private ArrayList<JToggleButton> cards;
    private CardListener cardListener;
    private GridBagLayout gridBagLayout;
    private GridBagConstraints constraints;
    private ImageIcon cardImage;
    private Player player;
    private ImageIcon bottom;
    private JLabel logo;
    private ImageIcon logoImage;
    
    /**
     *
     */
    public CenterUI ()
    {
        initComponents();
    }
    
    private void initComponents()
    {
        // layout manager
        gridBagLayout = new GridBagLayout();
        constraints = new GridBagConstraints();
        
       
        
        // setting up JPanel
        this.setLayout(gridBagLayout);        
        this.setMinimumSize(new Dimension(200, 600));
        this.setPreferredSize(new Dimension(200, 600));
        this.setMaximumSize(new Dimension(200, 600));
        //this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.setBackground( new Color(34,139,34));

        cards = new ArrayList<JToggleButton>();
        
        cardListener = new CardListener();
      
        
        logo = new JLabel();
        logo.setMinimumSize(new Dimension(165, 100));
        logo.setPreferredSize(new Dimension(165, 100));
        logo.setMaximumSize(new Dimension(165, 100));
        logoImage = new ImageIcon( getClass().getResource("../images/Rummy.png"));
        logoImage = logoResize(logoImage);
        logo.setIcon(logoImage);
        
        addComponent(0, 30, 0, 0, this, logo); 
      
        for(int i = 0; i < 1; i++)
        {
            JToggleButton top = new JToggleButton();
            top.setMinimumSize(new Dimension(75, 95));
            top.setPreferredSize(new Dimension(75, 95));
            top.setMaximumSize(new Dimension(75, 95));
            top.setAlignmentX(Component.CENTER_ALIGNMENT);            
            top.putClientProperty("card", (i + 1 ));
            top.putClientProperty("value", (i + 1));
            top.putClientProperty("selected", false);
            addImage(top);
            cards.add(top);
            addComponent(i, 10, 1, 1, this, top);        
        }
        
            JToggleButton bot = new JToggleButton();
            bot.setMinimumSize(new Dimension(75, 95));
            bot.setPreferredSize(new Dimension(75, 95));
            bot.setMaximumSize(new Dimension(75, 95));
            bot.setAlignmentX(Component.CENTER_ALIGNMENT);            
            bot.putClientProperty("card", (1));
            bot.putClientProperty("value", (1));
            bot.putClientProperty("selected", false);
            bot.addActionListener(cardListener);
            addBottom(bot);
            cards.add(bot);
            addComponent(1, 10, 1, 1, this, bot); 
        
            
              
    }
    
    private void addBottom(JToggleButton bot){
        
        bottom = new ImageIcon( getClass().getResource("../images/b2fv.png"));
        
        bottom = imageResize(bottom);
        bot.setIcon(bottom);
    }
    
    // method for adding the images to the card buttons
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
               image.getScaledInstance(75, 95, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        return icon;
    }
    private ImageIcon logoResize(ImageIcon icon)
    {
        Image image = icon.getImage();
        Image newImage = 
               image.getScaledInstance(160, 100, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        return icon;
    }
    /**
     *
     * @param cardData
     */
    public void setCard(ArrayList<Cards> cardData)
    {
        int index = 0;
        for(JToggleButton card : cards)
        {
            card.putClientProperty("value", cardData.get(index).getFaceValue());
            addImage(card);
            index++;
        }
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(Player player) {
        this.player = player;
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

    private class ShuffleListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            ArrayList<Cards> cardData = player.getShuffle().getCards();

            int counter = 0;
            
            for(JToggleButton card: cards)
            {
                boolean selected = (boolean)card.getClientProperty("selected");
                if(!selected)
                {
                    cardData.get(counter).shuffleCards();
                }
                counter++;
            }
            
            setCard(player.getShuffle().getCards());
        }    
    }
}
