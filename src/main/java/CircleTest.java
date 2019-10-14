/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siebu
 */
import javax.swing.JOptionPane;

public class CircleTest {
    public static void main( String [] args) {
        
        String userInputString;
        double userRadius;
        
        userInputString = JOptionPane.showInputDialog( "Please enter the circle's radius: ");
        userRadius = Double.parseDouble( userInputString);
    }
}
