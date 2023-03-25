/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan250323;

/**
 *
 * @author hp
 */
import javax.swing.JOptionPane;

public class Latihan2 {
    public static void main (String[]args){
        // Input nilai a
        String inputA = JOptionPane.showInputDialog("Masukkan nilai a: ");
        int a = Integer.parseInt(inputA);

        // Input nilai b
        String inputB = JOptionPane.showInputDialog("Masukkan nilai b: ");
        int b = Integer.parseInt(inputB);

        // Input nilai c
        String inputC = JOptionPane.showInputDialog("Masukkan nilai c: ");
        int c = Integer.parseInt(inputC);
        int avarage;
        
        avarage = (a+b+c)/3;
        
        JOptionPane.showMessageDialog(null, "number 1 = " + a + "\n" +
                                            "number 2 = " + b + "\n" +
                                            "number 3 = " + c + "\n" +
                                            "average = " + avarage);
    }
}
