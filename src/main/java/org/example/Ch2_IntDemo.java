package org.example;

import javax.swing.*;

public class Ch2_IntDemo {

    public static void main(String[] args){

        String name;
        name = JOptionPane.showInputDialog(null, "What is your name>> ");
        JOptionPane.showMessageDialog(null, "Hello " + name +
                " may you have a pleasant day.");
    }
}
