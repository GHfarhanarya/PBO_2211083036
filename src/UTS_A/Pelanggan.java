/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

/**
 *
 * @author hp
 */
public class Pelanggan {
    private String kodepelanggan;
    private String nama;
    private String jenis;
    
    public Pelanggan(){
        
    }
    
    public Pelanggan (String kodepelanggan, String nama, String jenis){
        this.kodepelanggan = kodepelanggan;
        this.nama = nama;
        this.jenis = jenis;
    }
    public String getKodepelanggan(){
        return kodepelanggan;
    }
    
    public void setKodepelanggan(String kodepelanggan){
        this.kodepelanggan = kodepelanggan;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
