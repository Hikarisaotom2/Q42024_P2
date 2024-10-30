/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_29102024;

/**
 *
 * @author claudiacortes
 */
public class Clase_29102024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Animal animal = new Animal(1.5,"Buenos",4,"Calico","Buenos","Muffin","Hogar",false); -> NO SE PUEDE INSTANCIAR POR QUE ES UNA CLASE ABSTRACTA

    Gato gatito = new Gato(1.5,"Buenos",4,"Calico","Buenos","Muffin","Hogar",false);
          Perro perrito = new Perro(1.5,"Buenos",4,"??","Buenos","Brownie","Hogar",false);

          gatito.sonido(); //miau 
          perrito.sonido(); //wuff
    }
    
}
