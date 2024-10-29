/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_28102024;

/**
 *
 * @author claudiacortes
 */
public class Gato extends Animal{
    public Gato(double velocidad, String reflejos, int patas, String raza, String instintos, String nombre, String habitat, boolean estado) {
        super(velocidad, reflejos, patas, raza, instintos, nombre, habitat, estado);
    }
    
    /*
    polimorfismo por sobrescritura: 
    1. el uso del override es voluntario. 
    2. Los metodos deben adecuarse a la estructura en la que estan definidos en el padre.
    3. se debe configurar para cada clase (si es que se desea)
    4. el polimorfismo se configura en el hijo, y aplica a cualquier metodo que el padre tenga
    */
    @Override
    public void sonido(){
        System.out.println("Miau miau");
    }
    
    @Override 
    public void contar(int x){
        System.out.println("el valor del contador es: "+x);
    }
    
}
