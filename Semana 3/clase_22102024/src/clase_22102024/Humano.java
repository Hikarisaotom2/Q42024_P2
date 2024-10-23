/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_22102024;

/**
 *
 * @author claudiacortes
 */
public class Humano extends Abuelo{
    String nombre;
    int edad;
    // el padre impuso que debe haber un constructor con dos elementos
    public Humano(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

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

    public void crud(){
        System.out.println("Seleccione la opcion que desea...");
    }

    @Override
    public String toString() {
        return "Humano{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
