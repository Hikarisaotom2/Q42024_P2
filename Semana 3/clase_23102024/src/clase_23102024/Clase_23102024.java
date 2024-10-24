/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_23102024;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_23102024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1. public: cualquier parte del programa puede ver que la clase posee esa informacion
        2. private: Solamente la clase tiene acceso a la informacion 
        3. protected: Solamente la clase y sus hijos tienen acceso a la informacion
        */
        
        
        /*
            Vamos a trabajar en un sistema de registro de la universidad, 
        hay dos tipos de usuarios, maestros y alumnos. 
        los maestros pueden iniciar clase y posee una cantidad de clases asignadas al periodo.
        los alumnos, poseen una cantidad de asistencias y se les puede registrar inasisstencias. 
        todos los usuarios, poseen correo y contrasena.
        
        el programa debe ser capaz de: 
        1. registrar usuarios
            registrar maestros o registrar alumnos 
        2. seleccionar un usuario 
            si el usuario es un docente, nos debera pedir inciiar la clase 
            si el usuario es un alumno registraremos su asistencia. 
        3. listar todos los usuarios indicando su tipo. 
        4. listar maestros y alumnos 
        5. editar informacion.
        */
        
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
//        usuarios= agregarUsuario(usuarios);
usuarios.add(new Alumno("patria234","1234",0));
        usuarios.add(new Maestro("clau_cortes","1234",2));
        
         usuarios.add(new Maestro("pavon123","1234",2));
         
         listarTodoslosUsuarios(usuarios);
        
    }
    
    public static void listarTodoslosUsuarios(ArrayList<Usuario> usuarios){
        
//        for (int i = 0; i < usuarios.size(); i++) {
//            Usuario usuario = usuarios.get(i);
//        }
            //for each 
             // esta variable va cambiando por cada iteracion (como lo hacia la i)
          for (Usuario usuario : usuarios) {
              // instanceof
              if(usuario instanceof Maestro){ // preguntarle a usuario si es una instancia de maestro
                  // en usuario hay almacenado un maestro
                  System.out.println(usuario.getCorreo()+" Maestro");
              }else if( usuario instanceof Alumno){
                  // en usuario hay almacenado un alumno
                  System.out.println(usuario.getCorreo()+" Alumno");
              }else{ // es un objeto de la clase usuario
                  
              }
          }
        
    }
    public static ArrayList<Usuario> agregarUsuario(ArrayList<Usuario> usuarios){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el correo");
        String correo = entrada.nextLine();
        System.out.println("Ingrese la contrasena");
        String contra = entrada.nextLine();
        System.out.println("El usuario es un 1. alumno o 2. docente ");
        int op = entrada.nextInt();
        if(op==1){
            Alumno a = new Alumno(correo,contra,0);
            usuarios.add(a);
        }else{
            System.out.println("ingrese la cantidad de clases que va a impartir: ");
            int clases = entrada.nextInt();
            Maestro m = new Maestro(correo,contra,clases);
            usuarios.add(m);
        }
        return usuarios;
    }
    
}
