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
    private ArrayList<VacunaPerro> vacunas;

    public Perro() {
    }

    public Perro(String nombre, String raza, Calendar proxVacuna) {
        this.nombre = nombre;
        this.raza = raza;
        this.proxVacuna = proxVacuna;
    }

    public void añadirVacuna(VacunaPerro vp) {
        vacunas.add(vp);
    }

    public boolean buscarVacunaPerro(VacunaPerro vp) {
        for (int i = 0; i < vacunas.size(); i++) {
            if (vacunas.get(i).getVacuna().equals(vp.getVacuna()) && vacunas.get(i).getFecha().equals(vp.getFecha())) {
                return true;

            }

        }
        return false;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", proxVacuna=" + proxVacuna + ", vacunas=" + vacunas + '}';
    }

    public void mostrarVacunasPerro() {
        for (VacunaPerro vacuna : vacunas) {
            System.out.println(vacuna);
        }
    }

    public void actualizarFecha() {
        Calendar fechaMax = null;
        for (VacunaPerro vacuna : vacunas) {
            if (vacuna.getFecha().after(fechaMax)) {
                fechaMax = vacuna.getFecha();
            }
        }
        fechaMax.add(Calendar.YEAR, 1);
        setProxVacuna(fechaMax);
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
