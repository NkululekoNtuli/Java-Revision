package org.example;

import javax.swing.*;

public class Ch2_NumsDialog {

    public static void main(String[] args){

        int creditDays = 30;
        JOptionPane.showMessageDialog(null, "" + creditDays);
        JOptionPane.showMessageDialog(null, "Every bill is due in " +
                creditDays + " days>.");
    }
}
