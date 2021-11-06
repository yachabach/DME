package com.panoptic.UI;

import com.panoptic.data.StimOutletPorts;
import com.panoptic.services.MessageService;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame{
    private JTabbedPane tbDevice;
    private JPanel panel1;
    private JPanel paneDevice;
    private JPanel paneProgram;
    private JFormattedTextField formattedTextField1;
    private JComboBox comboOutletPort;
    private JRadioButton rbtnBiphasic;
    private JRadioButton monphasicRadioButton;
    private JTextField tfAmplitude;
    private JTextField tfPulsewidth;
    private JTextField tfFrequency;
    private JRadioButton onceRadioButton;
    private JRadioButton everyUseRadioButton;
    private JTextField textField1;
    private JRadioButton perceptionRadioButton;
    private JRadioButton discomfortRadioButton;
    private JComboBox comboBox1;
    private JButton btnSend;
    private JTextField txtMsg;
    private JButton btnSendMsg;
    private JButton btnSendFormatted;
    private JLabel lblTextMsg;

    MessageService messageService;

    private String[] stimStrings = {"Both", "Left", "Right"};

    public MainGUI(String title){

        messageService = new MessageService();

        //Set size and location for entire app
        setLocation(200,100);
        setSize(600,600);
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*Create and set up the content pane.
        This is where we set the content for our form.  All of our components
        will go somewhere on the mainPanel.  This is how we make a connection
        with the components we build with the builder
         */
        setContentPane(panel1);
        pack();
        btnSendMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runBtnSendMsgAction();
            }
        });
    }

    private void runBtnSendMsgAction(){

        messageService.setDeviceMessage(txtMsg.getText());
        lblTextMsg.setText(txtMsg.getText());
        txtMsg.setText("");
    }


    public void setData(StimOutletPorts data) {
    }

    public void getData(StimOutletPorts data) {
    }

    public boolean isModified(StimOutletPorts data) {
        return false;
    }
}
