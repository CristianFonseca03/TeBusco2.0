/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import include.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class modeloPersonas extends Conexion {

    public boolean crear_persona(Persona p) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "call insertPersona(?,?,?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, p.getName());
            pst.setString(2, p.getGender());
            pst.setString(3, p.getDescription());
            pst.setString(4, p.getDate_birthday());
            pst.setString(5, p.getDate_disapperence());
            pst.setString(6, p.getImg());
            pst.setString(7, p.getName_PB());
            pst.setString(8, p.getPhone_PB());
            pst.setString(9, p.getCedula_PB());
            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e) {
        } finally {
            try {
                if (getConnection() != null) {
                    getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
            }
        }
        return flag;
    }

    public ArrayList<Persona> getAllPersonas() {
        ArrayList<Persona> arrayPersonas = new ArrayList();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "call selectAllPersonas()";
            pst = getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                arrayPersonas.add(new Persona(rs.getInt("id_persona"), rs.getString("nombre"), rs.getString("gender"), rs.getString("descripcion"), rs.getString("image"), rs.getString("name_PB"), rs.getString("phone_PB"), rs.getString("cedula_PB"), rs.getString("date_birthday"), rs.getString("date_disappearance")));
            }
            
        } catch (Exception e) {
        }finally{
            try {
                if(getConnection() != null)getConnection().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {
            
            }            
        } 
        return arrayPersonas;
    }
}
