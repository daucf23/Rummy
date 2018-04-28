/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author justi_000
 */
public class LogoUI extends JPanel{
    
    private JLabel logo;
    private ImageIcon logoImage;
    
    public LogoUI(){
        
        //Call method initComponents
        initComponents();
        
    }
    
    public void initComponents(){
        
        
        logo = new JLabel();
        logo.setMinimumSize(new Dimension(50, 50));
        logo.setPreferredSize(new Dimension(50, 50));
        logo.setMaximumSize(new Dimension(50, 50));
        logoImage = new ImageIcon( getClass().getResource("../images/Rummy.png"));
        logoImage = imageResize(logoImage);
        logo.setIcon(logoImage);
        
        this.add(logo);
    }
    
    
    private ImageIcon imageResize(ImageIcon icon) {
          
        Image image = icon.getImage();
        Image newImage = 
               image.getScaledInstance(75, 100, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        return icon;
    }
}
