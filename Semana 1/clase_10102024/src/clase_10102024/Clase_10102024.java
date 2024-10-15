/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_10102024;

/**
 *
 * @author claudiacortes
 */
public class Clase_10102024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Crear un metodo recursivo que recorra un arreglo de numeros y los vaya imprimiendo
        */
       // 1,5,8,9 
       int [] numeros  = {1,5,8,9};
//        for (int i = 0; i < numeros.length; i++) {
//            int contador =0;
//            System.out.println(numeros[i]);
//            contador++;
//            System.out.println("cONTADOR: "+contador);
//        }

        imprimirNumeros(numeros,0);
        
        Persona p = new Persona("Claudia Cortes",99,"Ing.Sistemas","Soltera");
        System.out.println(p);
    }
    
    /*
    1)Caso base: Nos ayuda a determinar cuando detener el ciclo
    2)Caso Recursivo: Nos ayuda a mantener el ciclo vivo. El metodo se llama a asi mismo. 
    
    NOTA: todo lo que este dentro del metodo recursivo,es lo que se estara repiiendo en cada iteracion
    */
    
    /*
    Compararlo con una caja vacia.
    
    1. los alementos se agregan de abajo hacia arriba 
    2.  cada vez que hagamos un llamado/ invocacion a un metodo (CUALQUIERA QUE SEA)
    lo vamos a meter en el callstack
    3. La computadora solamente se concentra en una cosa a la vez,
    nos vamos a enfocar en lo que este al tope del callstack 
    4. cada vez que un metdo termine, lo sacamos del callstack 
    */
    
    static void imprimirNumeros (int [] numeros, int contador) {
            // contador>=4
        if(contador>=numeros.length){// caso base 
            
        }else{// caso recursivo
            System.out.println(numeros[contador]);
            contador++;
            imprimirNumeros(numeros,contador);
        }
    }

}
