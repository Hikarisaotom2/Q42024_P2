/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_17102024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_17102024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /* CRUD 
        1) docentes
            1 crear 
            2 modifiar  -> 
            3 mostrar  -> recursion
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
         
         Docente docente = new Docente("Claudia Cortes",1234, "InG.Sistemas");
         
         Alumno alejandro = new Alumno("Alejandro Jose Castellanos",  "Ing.Sistemas",12345,0);
         Alumno blanca = new Alumno("Blanca Cilena Amaya",  "Ing.Sistemas",12345,0);
         Alumno sadith = new Alumno("Sadith Alejandro Ramos",  "Ing.Sistemas",12345,0);
         Alumno yulianna = new Alumno("Yulianna Lisbeth Perez",  "Ing.Sistemas",12345,0);
         
         ArrayList<Alumno> lista1 = new ArrayList<Alumno>();
         lista1.add(sadith);
         lista1.add(alejandro);
         lista1.add(blanca);
         lista1.add(yulianna);
         
        ArrayList<Alumno> lista2 = new ArrayList<Alumno>();
         lista2.add(alejandro);
         lista2.add(yulianna);
         
         Clase progra = new Clase("Programacion 2", 2244, "Ing.Sistemas/Ing.Ciencia de datos",docente, lista1);
         Clase ux = new Clase("Experiencia de usuario", 2244, "Ing.Sistemas/Ing.Ciencia de datos",docente, lista2);
         
         System.out.println("Información inicial de la seccion: ");
         System.out.println(progra);
         
         System.out.println("Pasar lista");
         pasarLista(lista1);
         
        System.out.println("Información actualizada de la seccion: ");
         System.out.println(progra);
         
    }
    
    public static void pasarLista(ArrayList<Alumno> alumnos){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            System.out.println("-> "+alumno.getNombre());
            System.out.println("Ingrese 1 si el alumno esta presente 2 caso contrario: ");
            int presente = entrada.nextInt();
            if(presente !=1){
                alumno.setAsistencias();
            }
        }
        System.out.println("Se registro la asistencia exitosamente\n");
        
    }
    public static void listar(ArrayList<Alumno> lista, int i) {
        /*
        //        int i=0; //iNCORRECTO
Todo lo que estre la llave de apertura y cierre del metodo, es lo que se va a repetir*/
        //        i >= size()
        //        for (int i = 0; i < lista.size(); i++) {
        //            System.out.println(lista.get(i));
        //        }

        /*
    1. caso base -> me indica cuando salir del ciclo
    2. caso recursivo -> nos ayuda a repetir el codigo, mantiene a la recursion viva, el metodo de llamara dentro de si mismo
         */
        
        if (i >= lista.size()) { // caso base 
            //el ciclo va a parar
        } else { // caso recursivo
            System.out.println(lista.get(i));
            i++;
            listar(lista, i);
        }

    }// Fin del metodo recursivo
    
}
