/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan160323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author hp
 */
public class Latihan61 {
    public static void main(String[] args) throws IOException {
        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.print("Masukkan nilai ujian 1 : ");
        double ujian1 = Double.parseDouble(baca.readLine());
        
        System.out.print("Masukkan nilai ujian 2 : ");
        double ujian2 = Double.parseDouble(baca.readLine());
        
        System.out.print("Masukkan nilai ujian 3 : ");
        double ujian3 = Double.parseDouble(baca.readLine());
        
        double r =(ujian1+ujian2+ujian3)/3;
        
        System.out.print("Rata-rata nilai anda : "+r+" ");
        
        if(r>=60){
            System.out.print(":)");
        }
        else{
            System.out.print(":(");
        }
    
    }
}
