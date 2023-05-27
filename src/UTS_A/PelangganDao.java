/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

/**
 *
 * @author hp
 */
import farhan150423.model.Anggota;
import java.util.List;
public interface PelangganDao {
    void save(Pelanggan pelanggan);
    void update(int index, Pelanggan pelanggan);
    void delete(int index);
    Anggota getPelanggan (int index);
    List<Pelanggan> getAll();
}
