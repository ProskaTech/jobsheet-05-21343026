
package com.mycompany.tugas;

/**
 * Created by Indah Chania 21343026
 * @author Indah
 */
import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args) {
    String word1 = "", word2 = "", word3 = "";
        
        word1 = JOptionPane.showInputDialog("Enter word 1: ");
        word2 = JOptionPane.showInputDialog("Enter word 2: ");
        word3 = JOptionPane.showInputDialog("Enter word 3: ");
        
        String msg = word1 + " " + word2 + " " + word3;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(word1 + " " + word2 + " " + word3);
}
}