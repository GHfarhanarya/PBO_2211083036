/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import farhan.dao.*;
import farhan.model.Anggota;
/**
 *
 * @author hp
 */
public class DbHelper {
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException {
        if(connection==null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost/pbo_2211083036");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String[] args) throws Exception{
        try{
            connection = DbHelper.getConnection();
            AnggotaDao dao = new AnggotaDaoImpl(connection);
            Anggota anggota=new Anggota("A001","Azmi","Padang","L");
            dao.insert(anggota);
            JOptionPane.showMessageDialog(null,"Entry data  Ok");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
    }
}
