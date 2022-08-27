/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.pkg2022;

/**
 *
 * @author 56974
 */
public class Reuniones {
    
    int hora_inicio;
    int hora_final;
    String actividad;

    public Reuniones(int hora_inicio, int hora_final, String actividad) {
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
        this.actividad = actividad;
    }
    
    
    
    

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_final() {
        return hora_final;
    }

    public void setHora_final(int hora_final) {
        this.hora_final = hora_final;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    
    
    
}
