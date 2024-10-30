/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_30102024;

/**
 *
 * @author claudiacortes
 */

/*Para asociar las interfaces y sus reglas , debemos utilizar una nueva palabra reservada.

-> con la interfaz, no todos los hijos estan obigados a usarla. 
sin embargo, cuando una clase usa o implementa la interffaz, esa clase esta OBLIGADA . a crear una sobreescritra de todos los metodos abstractos que hay en la interfaz. 
*/

public class Gato extends Animal implements MetodosAnimales {

    public Gato(double velocidad, String reflejos, int patas, String raza, String instintos, String nombre, String habitat, boolean estado) {
        super(velocidad, reflejos, patas, raza, instintos, nombre, habitat, estado);
    }
    
    
    @Override 
    public void sonido(){
    }
    
    @Override 
    public void hola(){
        
    }
}
