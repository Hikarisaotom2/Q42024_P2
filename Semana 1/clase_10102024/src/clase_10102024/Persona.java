/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_10102024;

/**
 *
 * @author claudiacortes
 */
public class Persona {
 //Atributos o propiedades
    String nombre;
    int edad;
    String carrera;
    String estadoCivil;
 //Metodos
    // constructor 
    Persona(String nombre, int edad, String carrera, String estadoCivil){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.estadoCivil = estadoCivil;
    }
    
    //mutadores (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
    
}
