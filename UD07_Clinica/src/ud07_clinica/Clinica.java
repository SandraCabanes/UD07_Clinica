/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07_clinica;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author mati
 */
public class Clinica {

    private String nombre;
    private ArrayList<Perro> perros;
    private Vector<Vacuna> vacunas = new Vector(20);

    public Clinica() {
    }

    public Clinica(String nombre) {
        this.nombre = nombre;
    }

    public void añadirPerro(Perro p) {
        perros.add(p);
    }

    public Perro buscarPerro(String nombre) {
        for (int i = 0; i < perros.size(); i++) {
            if (perros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return perros.get(i);
            }
        }
        return null;
    }

    public void añadirVacuna(Vacuna c) {
        vacunas.addElement(c);
    }

    public void mostrarVacunas(){
        for (int i = 0; i < vacunas.size(); i++) {
            System.out.println(vacunas.get(i).toString());
            
        }
    
    }
    
    public Vacuna obtenerVacuna(int id) {
        for (int i = 0; i < vacunas.size(); i++) {
            if (vacunas.get(i).getId() == id) {
                return vacunas.get(i);
            }

        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
