/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_16102024;

/**
 *
 * @author claudiacortes
 */
public class Docente {
    private String nombre;
    private int numeroTalentoHumano;
    private String profesion;

    public Docente(String nombre, int numeroTalentoHumano, String profesion) {
        this.nombre = nombre;
        this.numeroTalentoHumano = numeroTalentoHumano;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTalentoHumano() {
        return numeroTalentoHumano;
    }

    public void setNumeroTalentoHumano(int numeroTalentoHumano) {
        this.numeroTalentoHumano = numeroTalentoHumano;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "nombre :"+nombre+ "("+numeroTalentoHumano+")"+"- "+profesion;
    }
    
}
