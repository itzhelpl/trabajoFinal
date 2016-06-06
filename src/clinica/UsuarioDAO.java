/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrea Itzhel
 */
public class UsuarioDAO {
    
    public void agregarusuaario(Usuario us){
        DBConec conec = new DBConec();
        
         try {
            Statement consulta = conec.getConnection().createStatement();
            String sql = "INSERT INTO usuarios VALUES('" +us.getNomUsuario() + "', '" +
                    us.getPasswod() + "', '" + us.getTipoUsuario() + "', '" + us.getNombre() + "')";
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Se ha registrado el paciente");
            consulta.close();
            conec.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro la persona " + e);
        }
                    
    }
    
    public ArrayList<Usuario> obtenUsuario() {
        ArrayList <Usuario> arrUsu = new ArrayList<Usuario>();
        DBConec conec = new DBConec();
        String sql = "SELECT * FROM usuarios";
        
        try {
            PreparedStatement st = conec.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
               Usuario objUsuario = new Usuario(
                        rs.getString("Usuario"),
                        rs.getString("Password"),
                        rs.getInt("ClaveTipo"),
                        rs.getString("Nombre")
                );
                arrUsu.add(objUsuario);
            }
            rs.close();
            st.close();
            conec.desconectar();
            
        } catch(Exception e) {
            
        }
        return arrUsu;
    }
}
