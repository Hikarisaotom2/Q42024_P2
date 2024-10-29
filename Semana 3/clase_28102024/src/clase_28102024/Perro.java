/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_28102024;

/**
 *
 * @author claudiacortes
 */
public class Perro extends Animal{
    public Perro(double velocidad, String reflejos, int patas, String raza, String instintos, String nombre, String habitat, boolean estado) {
        super(velocidad, reflejos, patas, raza, instintos, nombre, habitat, estado);
    }
    
    @Override
    public void sonido(){
        System.out.println("Wuff wuff");
    }
    @Override 
    public void cazar(){
        System.out.println("Cazador");
    }
}
