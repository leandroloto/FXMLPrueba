/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Discar
 */
public class Conexion {
    
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "fxmlprueba";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection connection;
    
    public Conexion(){
        
    }
    
    public static Connection getConexion(){
        if(connection == null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB, USER,PASS);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en carga de Drivers "+ex.getMessage());
            }   catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        return connection;
    
}
    
}
