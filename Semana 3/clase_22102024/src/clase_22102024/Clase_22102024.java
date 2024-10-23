/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_22102024;

/**
 *
 * @author claudiacortes
 */
public class Clase_22102024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            /*
    notas importantes a considerar sobre la herencia: 
    1) en JAVA solamente se puede heredar de una clase a la vez 
    2) la relacion de herencia la hace el hijo
    3) el padre no conoce a sus hijos 
    4) los hijos no se conocen entre si, no saben que tiene "hermanos"
    5) Solamente el hijo puede tomar prestadas cosas del padre
    6) el hijo debe seguir las reglas y estructura del padre. 
             */

        Mujer claudia = new Mujer("Claudia", 33);
        
        System.out.println(claudia.getEdad());
        System.out.println(claudia);

        Hombre juan = new Hombre("Juan", 50);
        juan.llamarCrud();
        System.out.println(juan);
    }

}
