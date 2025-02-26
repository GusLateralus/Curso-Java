/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.base9_4_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lfper
 */
public class conexion {
    Connection cnn;
    String url="jdbc:postgresql://localhost:5432/northwind";
    String usuario="postgres";
    String contrasena="perico"; 
    boolean conectar()
    {
        try {
            cnn = DriverManager.getConnection(url, usuario, contrasena);
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se pudo hacer la conexion");
            return false;
        }
    }
    Connection get_conexion()
    {
        return cnn;
    }
}
