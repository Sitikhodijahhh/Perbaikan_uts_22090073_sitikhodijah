/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KONEKSI;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author sitik
 */
public class konekdata {
    public static Connection sambungkeDB(){
        try {
            MysqlDataSource mds = new MysqlDataSource();
            mds.setUser("root"); 
            mds.setPassword(""); 
            mds.setDatabaseName("mahasiswa2");
            mds.setPortNumber(3306); 
            mds.setServerName("localhost"); 
            mds.setServerTimezone("Asia/Jakarta"); 
            Connection con = mds.getConnection();
            return con;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}

