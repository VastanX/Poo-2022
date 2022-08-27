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
public class dias {
    
    String Nombre;
    int numero;
    int mes;
    int anno;
    Reuniones cita;

    public dias(String Nombre, int numero, int mes, int anno, Reuniones cita) {
        this.Nombre = Nombre;
        this.numero = numero;
        this.mes = mes;
        this.anno = anno;
        this.cita = cita;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Reuniones getCita() {
        return cita;
    }

    public void setCita(Reuniones cita) {
        this.cita = cita;
    }
    
    
    
}
