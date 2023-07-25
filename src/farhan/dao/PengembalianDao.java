/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package farhan.dao;

import java.util.List;
import farhan.model.Pengembalian;
/**
 *
 * @author hp
 */
public interface PengembalianDao {
    void Insert(Pengembalian pg) throws Exception;

    void Update(Pengembalian pg) throws Exception;

    void Delete(Pengembalian pg) throws Exception;

    Pengembalian getPm(String kodeBuku, String kodeanggota, String tglpinjam) throws Exception;

    List<Pengembalian> getAll() throws Exception;

    int terlambat(String tgl1, String tgl2) throws Exception;

    List<Pengembalian> cari(String kode, String cari) throws Exception;
}
