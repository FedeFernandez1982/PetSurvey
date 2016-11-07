package com.federico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Federico on 10/25/2016.
 */
public class PetSurvey extends JFrame{
    private JPanel rootPanel;
    private JCheckBox dogCheckBox;
    private JCheckBox catCheckBox;
    private JCheckBox fishCheckBox;
    private JLabel SurveyText;
    private JLabel SurveyResult;
    private JButton quitButton;

    private boolean dog;
    private boolean cat;
    private boolean fish;

    private void updateResults(){

        String hasdog = dog ? "one dog" : "no dogs";
        String hascat = cat ? "one cat" : "no cats";
        String hasfish = fish ? "one fish" : "no fishes";

        String results = "You have " + hasdog + " and " + hascat + " and " + hasfish;
        SurveyResult.setText(results);
    }


    protected PetSurvey(){

        setContentPane(rootPanel);
        pack();
        setSize(350,200);
        setTitle("Pet Survey");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);






        fishCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                fish = fishCheckBox.isSelected();
                updateResults();
            }
        });
        catCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cat = catCheckBox.isSelected();
                updateResults();
            }
        });
        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                dog = dogCheckBox.isSelected();
                updateResults();
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
