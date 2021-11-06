package com.panoptic.UI;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class DeviceManagerGUI extends JFrame {
    public JFrame mainFrame;
    public JPanel mainPanel;

    public DeviceManagerGUI(String title) {

        //super is the superclass.  The JFrame superclass is instantiated
        //which is the base object for out DeviceManagerGUI
        super(title);

        //mainFrame = new JFrame();
        //Set size and location for entire app
        setLocation(200,100);
        setSize(600,600);
        //setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new MigLayout());


        /*Create and set up the content pane.
        This is where we set the content for our form.  All of our components
        will go somewhere on the mainPanel.  This is how we make a connection
        with the components we build with the builder
         */
        setContentPane(mainPanel);
//
        mainPanel.add(new TabbedPaneGUI());
        //pack();

    }


}
