/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_17102024;

/**
 *
 * @author claudiacortes
 */
public class Alumno {
    private String nombre;
    private String carerra;
    private int cuenta;
    private int asistencias;

    public Alumno(String nombre, String carerra, int cuenta, int asistencias) {
        this.nombre = nombre;
        this.carerra = carerra;
        this.cuenta = cuenta;
        this.asistencias = asistencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarerra() {
        return carerra;
    }

    public void setCarerra(String carerra) {
        this.carerra = carerra;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias() {
        asistencias ++;
    }

    @Override
    public String toString() {
        return cuenta + " - "+nombre + "( inasistencias " + asistencias + ')';
    }
    
    
}
