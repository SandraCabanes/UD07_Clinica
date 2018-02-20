/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07_clinica;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author mati
 */
public class Perro {
    private String nombre;
    private String raza;
    private Calendar proxVacuna;
    private ArrayList<Vacuna> vacunas;

    public Perro() {
    }

    public Perro(String nombre, String raza, Calendar proxVacuna) {
        this.nombre = nombre;
        this.raza = raza;
        this.proxVacuna = proxVacuna;
    }
    
    public void añadirVacuna(Vacuna c){
        vacunas.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Calendar getProxVacuna() {
        return proxVacuna;
    }

    public void setProxVacuna(Calendar proxVacuna) {
        this.proxVacuna = proxVacuna;
    }
    
    
}
