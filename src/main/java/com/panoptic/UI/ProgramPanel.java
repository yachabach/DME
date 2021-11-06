package com.panoptic.UI;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

/**
 *
 * This panel contains the programming elements for the Evren Device manager.
 *
 * This panel was written to allow device testing
 */
public class ProgramPanel extends JPanel {

    JPanel programPanel;
    TitledBorder title;

    public ProgramPanel(MigLayout layout){

        super(layout);

        //Define border style
        Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        //Stimulation panel
        MigLayout subLayout = new MigLayout("fillx","[left]rel[grow,fill]", "[]10[]");
        JPanel stimPanel = new JPanel(subLayout);
        title = BorderFactory.createTitledBorder(
                loweredetched, "Stimulation");
        title.setTitleJustification(TitledBorder.LEFT);
        stimPanel.setBorder(title);

        //Program length
        JLabel progLabel = new JLabel("Program Length");
        JTextField txtLen = new JFormattedTextField(createFormatter("h:mm"));
        stimPanel.add(progLabel, "wrap");
        stimPanel.add(txtLen);
        add(stimPanel, "span");


//        JButton btn = new JButton();
//        JLabel lbl = new JLabel();
//        btn.addActionListener(e -> lbl.setText("Button Pressed"));
//        btn.setText("Do Something");
//        add(btn, "span, wrap");
//        add(lbl, "span");
    }


    /**
     * This is required to catch exceptions from a poorly created mask
     *
     * @param s
     * @return
     */
    protected MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
        } catch (java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
            System.exit(-1);
        }
        return formatter;
    }
}
