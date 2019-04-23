package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ASUS
 */
public class CyberAgora {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        try {

            JFrame jFrame = new JFrame();
            JPanelMain jPanelMain = new JPanelMain(jFrame);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = screenSize.getWidth();
            width= width/6;
            int intWidth = (int) Math.round(width);
            double height = screenSize.getHeight();
            height = height/6;
            int intheight = (int) Math.round(height);
            jFrame.setLocation(intWidth, intheight);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            jFrame.add(jPanelMain);
            jFrame.pack();
            jFrame.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        } 

    }
    

    
}
