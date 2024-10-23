/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_22102024;

/**
 *
 * @author claudiacortes
 */

/*
La configuracion de la herencia
y establecer los vinculos con el padre se hace unicamente en las clases hijas.
*/
    // nombre clase hija extends nombre clase padre
public class Hombre extends Humano {
    private String tonoVoz;
    
    public Hombre(String nombre, int edad){
        //super -> padre 
        super(nombre,edad); // llamar automaticamente al constructor del padre
    }
    
    
    public void llamarCrud(){
        super.crud();
    }

    @Override
    public String toString() {
        return "Hombre{" + "nombre=" + nombre + ", edad=" + edad + " tonoVoz=" + tonoVoz + '}';
    }
   
 
}
