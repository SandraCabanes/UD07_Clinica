/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07_clinica;

/**
 *
 * @author mati
 */
public class Vacuna {
    private int id;
    private int recuerdo;
    private String nombre;
    private double precio;

    public Vacuna() {
    }

    public Vacuna(int id, int recuerdo, String nombre, double precio) {
        this.id = id;
        this.recuerdo = recuerdo;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "id=" + id + ", recuerdo=" + recuerdo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecuerdo() {
        return recuerdo;
    }

    public void setRecuerdo(int recuerdo) {
        this.recuerdo = recuerdo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
