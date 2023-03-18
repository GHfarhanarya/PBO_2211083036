/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan160323;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Latihan66dw {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka=in.nextInt();
        
        System.out.print("Masukkan pangkat : ");
        int pangkat=in.nextInt();
        
        int hasil=1;
        int i=1;
        do{
            hasil*=angka;
            i++;
        }while(i<=pangkat);
        
        System.out.println(angka+" pangkat "+angka+" adalah "+hasil);
    }    
}
