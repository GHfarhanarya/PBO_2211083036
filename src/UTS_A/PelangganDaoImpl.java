/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hp
 */
public class PelangganDaoImpl implements PelangganDao {
    List<Pelanggan> data = new ArrayList<>();
    
    public PelangganDaoImpl(){
        data.add(new Pelanggan("1111", "Ali", "VIP"));
        data.add(new Pelanggan("1112", "Rizky", "GOLD"));
        data.add(new Pelanggan("1113", "Razor", "-"));
    }
    
    public void save(Pelanggan pelanggan){
        data.add(pelanggan);
    }
    
    public void update(int index, Pelanggan pelanggan){
        data.set(index, pelanggan);
    }
    
    public void delete (int index){
        data.remove(index);
    }
    
    public Pelanggan getPelanggan(int index){
        return data.get(index);
    }
    public List<Pelanggan> getAll(){
        return data;
    }
}
