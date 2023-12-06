/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Discar
 */
public class Users {
    
        private final Connection con;
    
    public Users(){
        con = Conexion.getConexion();
    }
    
    public Usuario loginConex(String user, String pass){
        Usuario use= new Usuario();
        int exito=0;
        String sql = "SELECT * FROM us WHERE usuario = ? AND password = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, user);
                ps.setString(2, pass);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    use.setUser(rs.getString("usuario"));
                    use.setPass(rs.getString("password"));
                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar el usuario y la contraseña. Verifique.");
            }
        return use;
    }

}
