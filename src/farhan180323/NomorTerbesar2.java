/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan180323;

/**
 *
 * @author hp
 */
import javax.swing.JOptionPane;

public class NomorTerbesar2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        
        // Meminta input dan menyimpannya dalam array
        for (int i = 0; i < numbers.length; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i+1) + ": ");
            numbers[i] = Integer.parseInt(input);
        }
        
        // Mencari input terbesar
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Menampilkan input terbesarr
        JOptionPane.showMessageDialog(null, "Input terbesar adalah: " + max);
    }
}

