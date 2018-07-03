/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modeloPersonas;
import include.Persona;
import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class ControladorPersonas {

    Modelo.modeloPersonas mp;

    public ControladorPersonas() {
        mp = new modeloPersonas();
    }

    public boolean crearPersona(Persona p) {
        return mp.crear_persona(p);
    }

    public ArrayList getPersonas() {
        return mp.getAllPersonas();
    }

}
