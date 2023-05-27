/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

/**
 *
 * @author hp
 */
public class Warnet {
    private Pelanggan pelanggan;
    private String tanggalMasuk;
    private int jamMasuk;
    private int jamKeluar;
    private double tarif;

    public Warnet(Pelanggan pelanggan, String tanggalMasuk, int jamMasuk, int jamKeluar, double tarif) {
        this.pelanggan = pelanggan;
        this.tanggalMasuk = tanggalMasuk;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.tarif = tarif;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public int getJamMasuk() {
        return jamMasuk;
    }

    public int getJamKeluar() {
        return jamKeluar;
    }

    public double getTarif() {
        return tarif;
    }
}


