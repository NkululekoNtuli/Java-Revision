package org.example;

import javax.swing.*;

public class Ch2_UsingConfirmDB {

    public static void main(String[] args){

        int selection;
        boolean isYes;
        selection = JOptionPane.showConfirmDialog(null,
                "Do you want to upgrade to first class?");
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,
                "You responded " + isYes);
    }

}
