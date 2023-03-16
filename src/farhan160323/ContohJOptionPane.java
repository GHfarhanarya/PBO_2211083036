/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan160323;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class ContohJOptionPane {
    public static void main(String[] args){
    String name = "";
    name = JOptionPane.showInputDialog("Please entre your name");
    String mag = "Hello " + name + "!";
    
    JOptionPane.showMessageDialog(null, mag);
    
    
    }
}
