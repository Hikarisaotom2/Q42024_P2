/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_30102024_ejercicios;

/**
 *
 * @author claudiacortes
 */
public abstract class Colaboradores {
    protected int id;
    protected String nombre;
    protected String fechaIngreso;
    protected String puesto;

    public Colaboradores(int id, String nombre, String fechaIngreso, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public abstract void generarBoleta();

    @Override
    public String toString() {
        return "Colaboradores{" + "id=" + id + ", nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", puesto=" + puesto + '}';
    }
}
