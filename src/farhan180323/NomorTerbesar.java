/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan180323;

/**
 *
 * @author hp
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NomorTerbesar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        
        // Meminta input dari user dan menyimpannya dalam array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Masukkan nomor ke-" + (i+1) + ": ");
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        
        // Mencari input terbesar
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Menampilkan input terbesar
        System.out.println("Input terbesar adalah: " + max);
    }
}

