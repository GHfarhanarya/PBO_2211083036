/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

import UTS_A.Pelanggan;
import UTS_A.PelangganDao;
import UTS_A.PelangganDaoImpl;
import UTS_A.view.FormPelanggan;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class PelangganController {
    private FormPelanggan formPelanggan;
    private PelangganDao pelangganDao;
    private Pelanggan pelanggan;
    
    public PelangganController (FormPelanggan formPelanggan){
        this.formPelanggan = formPelanggan;
        pelangganDao = new PelangganDaoImpl();
    }
    
    public void bersihForm(){
        formAnggota.getTxtKodepelanggan().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtJenis().setText("");
    }
    
    public void savePelanggan(){
        pelanggan = new Pelanggan();
        pelanggan.setNobp(formPelanggan.getTxtNobp().getText());
        pelanggan.setNama(formPelanggan.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        javax.swing.JOptionPane.showMessageDialog(formAnggota,
                "Entri OK");
    }
    
    public void getAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota != null){
            formAnggota.getTxtNobp().setText(anggota.getNobp());
            formAnggota.getTxtNama().setText(anggota.getNama());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
                    
        }
    }
    
    public void updateAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.update(index, anggota);
        javax.swing.JOptionPane.showMessageDialog(formAnggota,
                "Update OK");
    }
    
    public void deleteAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formAnggota,
                "Delete OK");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Anggota> list = anggotaDao.getAll();
        for(Anggota anggota : list){
            Object[] data = {
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat() 
            };
            tabelModel.addRow(data);
        }
    }
}
