/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan180323;

/**
 *
 * @author hp
 */
public class Latihan771doWhile {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        // Mencetak semua hari dalam seminggu menggunakan do-while-loop
        int i = 0;
        do {
            System.out.println(days[i]);
            i++;
        } while (i < days.length);
    }
}
