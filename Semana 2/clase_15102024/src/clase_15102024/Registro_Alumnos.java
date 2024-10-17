/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_15102024;

/**
 *
 * @author claudiacortes
 */
public class Registro_Alumnos {
    /*
    1. nombre
    2. carrera
    3. info_cantacto
    4. Titulo de secundaria ????????
    */
    //atributos
    private String nombre;
    private String carrera;
    private String info_contacto;
    private String titulo;
    
    //metodos
    //constructor 
    
    //constructor para matricula normal
       public Registro_Alumnos(String nombre, String carrera, String info_contacto, String titulo) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.info_contacto = info_contacto;
        this.titulo = titulo;
        System.out.println("______________________________________________ \n");
        System.out.println("Matricula normal exitosa para !"+nombre);
           System.out.println("______________________________________________ \n");
    }

    //constructor para matricula condicionada
    public Registro_Alumnos(String nombre, String carrera, String info_contacto) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.info_contacto = info_contacto;
        System.out.println("______________________________________________ \n");
        System.out.println("Matricula condicionada, ingrese informacion adiciona");
        System.out.println("-> fecha limite de entrega de documentos: 6 meses");
        System.out.println("-> fecha en la que el alumno entregara los documentos");
        System.out.println("Matricula condicionada para "+nombre);
        System.out.println("______________________________________________ \n");  
    }
    //mutadores(setters y getters)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getInfo_contacto() {
        return info_contacto;
    }

    public void setInfo_contacto(String info_contacto) {
        this.info_contacto = info_contacto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Registro_Alumnos{" + "nombre=" + nombre + ", carrera=" + carrera + '}';
    }



    
    
}
