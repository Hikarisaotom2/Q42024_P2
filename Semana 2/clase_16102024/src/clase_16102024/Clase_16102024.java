/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_16102024;

/**
 *
 * @author claudiacortes
 */
public class Clase_16102024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Programacion 2";
        int seccion = 1234;
        String carrera = "Ing. sistemas comp";
        Docente maestro = new Docente("Claudia Cortes",12345,carrera);// => DIRECCION
        Clase programacion2 = new Clase(nombre,seccion,carrera,maestro);
        System.out.println("________________________________________________\n");
        System.out.println("INFO CLASE:");
        System.out.println(programacion2);
        System.out.println("________________________________________________\n");
        
        /*Supongamos que un docente se cambia el nombre*/
        maestro.setNombre("Juanita Perez");  // => FUIMOS A LA DIRECCION DEL MAESTRO Y CAMBIAMOS LOS DATOS
        System.out.println("________________________________________________\n");
        System.out.println("Informacion actualizada: "+ maestro);
        System.out.println("________________________________________________\n");
        
        
          System.out.println("________________________________________________\n");
          System.out.println("INFO CLASE:");
        System.out.println(programacion2);
        System.out.println("________________________________________________\n");
        /* CRUD 
        1) docentes
            1 crear 
            2 modifiar 
            3 mostrar 
            4 eliminar 
        2) alumnos 
            1 crear 
            2 modifiar 
            3 mostrar 
            4 eliminar 
        3) crear secciones 
            1 crear 
            2 modifiar 
            3 mostrar 
            4 eliminar 
        
        */
    }
    
}
