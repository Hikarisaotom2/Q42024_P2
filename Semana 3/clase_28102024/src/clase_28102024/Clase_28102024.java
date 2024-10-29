/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_28102024;

/**
 *
 * @author claudiacortes
 */
public class Clase_28102024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gato gatito = new Gato(1.5,"Buenos",4,"Calico","Buenos","Muffin","Hogar",false);
       Perro perrito = new Perro(1.5,"Buenos",4,"??","Buenos","Brownie","Hogar",false);
       
       gatito.sonido(); //miau 
       perrito.sonido(); //wuff
       
       perrito.cazar();
       gatito.cazar();
       
       perrito.contar(0);
       gatito.contar(10);
       
    }
    
}
