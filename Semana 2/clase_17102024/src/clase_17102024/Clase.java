/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_17102024;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
    /*Clase compuesta: es una clase que tiene como minimo un  atributo que NO es de un tipo primitivo.
    por ejemplo, una clase que tenga un atributo que sea un objeto
    */

public class Clase {
    private String nombre;
    private int seccion;
    private String carrera;
    private Docente maestro;
    private ArrayList<Alumno> alumnos;

    public Clase(String nombre, int seccion, String carrera, Docente maestro) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.carrera = carrera;
        this.maestro = maestro;
        this.alumnos = new ArrayList<Alumno>();
    }

    public Clase(String nombre, int seccion, String carrera, Docente maestro, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.carrera = carrera;
        this.maestro = maestro;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Docente getMaestro() {
        return maestro;
    }

    public void setMaestro(Docente maestro) {
        this.maestro = maestro;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    /*
    Pendientes:
    1) imprimir la lista de los alumnos recursivamente 
    2) trabajar con strings
    */
    public void listar(ArrayList<Alumno> lista, int i) {
        if (i >= lista.size()) { // caso base 
            //el ciclo va a parar
        } else { // caso recursivo
            System.out.println(lista.get(i));
            i++;
            listar(lista, i);
        }

    }// Fin del metodo recursivo
    
    @Override
    public String toString() {
        System.out.println("ALUMNOS PARA LA SECCION");
        listar(alumnos,0);
        return nombre+" -  "+seccion+"\n informacion del maestro: "+maestro;
    }

    
}
