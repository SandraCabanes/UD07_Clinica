/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07_clinica;

import java.util.Calendar;

/**
 *
 * @author mati
 */
public class VacunaPerro {
    private Calendar fecha;

    public VacunaPerro() {
    }

    public VacunaPerro(Calendar fecha) {
        this.fecha = fecha;
    }
    
    public boolean buscarVacunaPerro(Perro p, Calendar fecha){
        
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    
    
}
