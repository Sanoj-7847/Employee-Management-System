/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author hp
 */
import java.sql.*;
public class ViewService {
    public static boolean getData(String name) {
        try {
            Connection cn = repository.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from user_table where name = '"+name+"'");
            while(rs.next()) {
                return true;
            }
        }catch(Exception ee) {
            ee.printStackTrace();
        }
        return false;
    }
}