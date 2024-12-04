/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_03122024;

import java.io.Serializable;

/**
 *
 * @author claudiacortes
 */

/*
Si queremos escribir un objeto, el objeto debe implementar una interfaz. 
Debe eimplementar la interfaz serializable.
*/
public class Persona implements Serializable{
    private String nombre;
    private String appelido;
   

    public Persona(String nombre, String appelido) {
        this.nombre = nombre;
        this.appelido = appelido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido() {
        return appelido;
    }

    public void setAppelido(String appelido) {
        this.appelido = appelido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", appelido=" + appelido + '}';
    }
    
    
}
