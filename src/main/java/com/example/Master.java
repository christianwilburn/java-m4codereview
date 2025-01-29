package com.example;
import javax.swing.JOptionPane;

public class Master {

   // create showChar method with alpha and digt args
   static void showChar(char alpha, int digt) {
    System.out.println(alpha + "- is at position: " + digt);
}

public static void main(String[] args) {
    String input = JOptionPane.showInputDialog(null, "Enter one word please");

    while (true) { // Loop to keep asking until valid input is provided
        String num = JOptionPane.showInputDialog(null, "Please enter a number");
        try {
            int letr = Integer.parseInt(num);

            // Check if the number is within bounds
            if (letr >= 0 && letr < input.length()) {
                char output = input.charAt(letr);
                showChar(output, letr);
                break; // Exit the loop once a valid number is processed
            } else {
                JOptionPane.showMessageDialog(null,
                        "Please enter a number between 0 and " + (input.length() - 1));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numerical value!");
        }
    }
}
}