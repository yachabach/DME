package com.panoptic.UI;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.util.List;

public class TabbedPaneGUI extends JTabbedPane{

    JTabbedPane tabbedPane;

    public TabbedPaneGUI(){

        JTextArea ta=new JTextArea(200,200);
        MigLayout layout = new MigLayout("fillx","[center]");

        JPanel p1=new ProgramPanel(layout);
        p1.add(ta);
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        //JTabbedPane tp=new JTabbedPane();
        //tp.setBounds(50,50,200,200);
        //tp.add(tabLabels.get(0),p1);
        //tp.add("visit",p2);
        //tp.add("help",p3);
        setBounds(50,50,200,200);
        add("tab1",p1);
        add("visit",p2);
        add("help",p3);
    }
}
