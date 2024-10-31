/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_30102024_ejercicios;

/**
 *
 * @author claudiacortes
 */
public class Clase_30102024_ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Polimorfismo 

    1. Sobreescritura simple 
        -> El método polimórfico que vamos a sobreescribir debe tener 
        la misma estructura que el método en la clase padre.
        -> El hijo puede decidir si desea implementar el polimorfismo o no.

    2. Clases abstractas 
        -> Una clase abstracta es una clase que no se puede instanciar y 
        debe contener al menos un método abstracto.
        -> El método abstracto debe ser implementado en las clases hijas, 
        obligando a estas a crear un método polimórfico.
        -> Al extender una clase abstracta, la clase padre pierde la capacidad de ser instanciada.

    3. Interfaces 
        -> Una interfaz es similar a una clase abstracta,Pero no es una clase y  todos sus métodos son abstractos, 
        lo que las hace extremadamente genéricas.
        -> La clase hija está obligada a implementar todos los métodos definidos en la interfaz.
        -> Una interfaz no puede ser instanciada y "la herencia" se implementa de forma diferente a la de las clases.
        -> Las interfaces pueden combinarse con el uso de herencia.
        */
        
       /*
        CRUD de Recursos humanos.
        1. crear colabores:
        para todos los colaboradores se conoce:
        su nombre, id, fecha de ingreso, puesto
            -> colaborador a tiempo indefinido. 
                -> salario base 
                -> deduccion del rap
                -> deduccion del ihss
                -> deduccion de ahorro 
                -> isr 15% >= 17000
                    isr 20 >= 25000
                    isr 25% >=50000
            -> colaborador temporal. 
                  -> salario base 
                -> deduccion del rap
                -> deduccion del ihss
                -> deduccion de ahorro 
            -> contratistas. 
                -> cantidad horas trabajadas por mes 
                -> pago por hora
        2. listar colaboraores: 
            -> listar todos 
            -> listar por tipo 
                -> tiempo indefinido
                -> temporal
                -> contratistas
        3. eliminar colaborador de la nomina
        
        4. calcular boletas de pago para colaboradores.
            -> colaboradores por tiempo indefinido: 
                -> mostrar salario base 
                -> mes actual 
                -> mostrar deducciones: en desglose y el valor total 
                -> mostrar y calcular el valor total neto (valor a recibir) 
            -> colaboradores temporales: 
                -> mostrar salario base 
                      -> mes actual 
                      -> mostrar deducciones: en desglose y el valor total 
                      -> mostrar y calcular el valor total neto (valor a recibir) 
            -> contratistas 
                    -> pago por hora 
                    -> cantidad de horas trabajadas 
                    -> total a recibir (horas*pago por hora)
        
        */
       
       /*
      
       PADRE:
       colaboradores
       HIJOS:
        -> indefinido 
       -> temporal 
       -> contratista 
       
       Solucion alternativa: 
                                padre: colaboradores 
                padre/hijo: colaborador con deducciones      hijo:contratistas 
                    hijo:temporales    hijo:indefinido
       
       recomendacion: utilizar una clase
        -> salario  -> clase compuesta 
         -> recursos humanos  -> clase compuesta 
       */
    }
    
}
