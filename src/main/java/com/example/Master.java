package com.example;
import javax.swing.JOptionPane;

public class Master {

    // create showChar method with alpha and digt args
    static void showChar(char alpha, int digt) {
        System.out.println(alpha + "- is at position: " + digt);
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter one word please");
        String num = JOptionPane.showInputDialog(null, "Please enter a number");

        // convert num to int format and select that number as char placement
        int letr = Integer.parseInt(num);

        while (input.length() >= letr) {
            try {
                char output = input.charAt(letr);
                showChar(output, letr);
                if (input.length() < letr) {
                    JOptionPane.showMessageDialog(null,
                            "Please Enter a number equal to or less than the word length! ");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a numerical value!");
            }

        }

    }

}
