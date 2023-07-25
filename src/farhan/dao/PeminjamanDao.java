/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package farhan.dao;

import java.util.List;
import farhan.model.Peminjaman;
/**
 *
 * @author hp
 */
public interface PeminjamanDao {
    void insert (Peminjaman peminjaman) throws Exception;
    void update (String index, Peminjaman peminjaman)throws Exception;
    void delete (String index) throws Exception;
    Peminjaman getPeminjaman(String kode) throws Exception;
    List<Peminjaman> getAll() throws Exception;
}
