/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_22102024;

/**
 *
 * @author claudiacortes
 */


public class Mujer extends Humano{
    private String largoCabello;
   public Mujer(String nombre, int edad){
       super(nombre,edad);
   }

    @Override
    public String toString() {
        return "Mujer{" + "nombre=" + nombre + ", edad=" + edad +" largoCabello=" + largoCabello + '}';
    }
   
   
}
