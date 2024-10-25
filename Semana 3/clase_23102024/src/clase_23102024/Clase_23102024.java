/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_23102024;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        LISTO 1. registrar usuarios
            registrar maestros o registrar alumnos  
        LISTO 2. seleccionar un usuario 
            si el usuario es un docente, nos debera pedir inciiar la clase 
            si el usuario es un alumno registraremos su asistencia. 
        LISTO 3. listar todos los usuarios indicando su tipo. 
        LISTO 4. listar maestros y alumnos 
        5. editar informacion.
        */
        
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
//        usuarios= agregarUsuario(usuarios);
        usuarios.add(new Alumno("patria234", "1234", 0));
        usuarios.add(new Maestro("clau_cortes", "1234", 2));
        usuarios.add(new Maestro("pavon123", "1234", 2));
        listarTodoslosUsuarios(usuarios);
        editarUsuario(usuarios);
        listarAlumnos(usuarios);
        listarMaestros(usuarios);

    }
    
    public static void editarUsuario(ArrayList<Usuario> usuarios){
        Usuario seleccionado = seleccionarUsuario(usuarios);
        Scanner entrada = new Scanner(System.in);
        if(seleccionado instanceof Maestro){
            Maestro maestroEditar = (Maestro) seleccionado;
            System.out.println("Ingrese el nuevo correo: ");
            String  correo = entrada.nextLine();
            System.out.println("Ingrese la contrasena: ");
            String contra = entrada.nextLine();
            System.out.println("Ingrese la cantidad de clases: ");
            int clases = entrada.nextInt();
            maestroEditar.setCorreo(correo);
            maestroEditar.setContrasena(contra);
            maestroEditar.setCantidadClases(clases);
        }else if(seleccionado instanceof Alumno){
            Alumno alumnoEditar = (Alumno) seleccionado;
            System.out.println("Ingrese el nuevo correo: ");
            String  correo = entrada.nextLine();
            System.out.println("Ingrese la contrasena: ");
            String contra = entrada.nextLine();
            System.out.println("Ingrese las inasistencias: ");
            int asistencias = entrada.nextInt();
            alumnoEditar.setCorreo(correo);
            alumnoEditar.setContrasena(contra);
            alumnoEditar.setCantidadFaltas(asistencias);
        }
        JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente!");
    }
    
    public static void ejecutarAccionUsuarioActual(ArrayList<Usuario> usuarios){
        Usuario seleccionado = seleccionarUsuario(usuarios);
        /*
        Antes de realizar las acciones para el maestro o el alumno. 
        debemos hacer una conversion de tipos

        Casteo /Casting: conversion explicita de datos. ejemplo: Convertir de string a entero. 
        Java no hace esta operación automaticamente, depende del usuario hacerlo. 
        */
        
        // CORRECTO: Usuario -> Alumno 
                    // Usuario -> Maestro
        //INCORRECTO: Alumno -> Usuario
                    // Maestro -> Usuario
        /*
        TipoDeDatoAConvertir variable =  (TipoDeDatoAConvertir) valorqueQueremosConvertir;          
        */
        if(seleccionado instanceof Maestro){
            // seleccionado es un maestro
            System.out.println("Usuario seleccionado es un maestro");
            Maestro maestroSeleccionado = (Maestro)seleccionado; // casteo
            maestroSeleccionado.iniciarClase("123");
        }else if(seleccionado instanceof Alumno){
            // seleccionado es un alumno
            System.out.println("Usuario seleccionado es un alumno");
             Alumno alumnoSeleccionado = (Alumno)seleccionado; //casteo
             alumnoSeleccionado.registrarAusencia();
        }
        
    }
    public static Usuario seleccionarUsuario(ArrayList<Usuario> usuarios){
        Scanner entrada = new Scanner(System.in);
        int i=-1;
        
        while (i<0 || i>= usuarios.size()) {
            System.out.println("Ingrese la posicion del usuario que desea seleccionar: ");
            i = entrada.nextInt();
        }
        return usuarios.get(i);
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
    
    //listar alumnos y maestros por separado 
    
    private static void listarAlumnos(ArrayList<Usuario> usuarios) {
        System.out.println("---------- Alumnos ----------");
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Alumno) {
                System.out.println(usuario.toString());
            }
        }
    }

    private static void listarMaestros(ArrayList<Usuario> usuarios) {
        System.out.println("---------- Maestros ----------");
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Maestro) {
                System.out.println(usuario.toString());
            }
        }
    }
    
}
