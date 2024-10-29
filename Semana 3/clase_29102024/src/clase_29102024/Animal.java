/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_29102024;

/**
 *
 * @author claudiacortes
 */
public class Animal {
    double velocidad;
    String reflejos;
    int patas;
    String raza;
    String instintos;
    String nombre;
    String habitat;
    boolean estado;
public Animal(){
    
}
    public Animal(double velocidad, String reflejos, int patas, String raza, String instintos, String nombre, String habitat, boolean estado) {
        this.velocidad = velocidad;
        this.reflejos = reflejos;
        this.patas = patas;
        this.raza = raza;
        this.instintos = instintos;
        this.nombre = nombre;
        this.habitat = habitat;
        this.estado = estado;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getReflejos() {
        return reflejos;
    }

    public void setReflejos(String reflejos) {
        this.reflejos = reflejos;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getInstintos() {
        return instintos;
    }

    public void setInstintos(String instintos) {
        this.instintos = instintos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //metodos
    
    public void cazar(){
        System.out.println("defina el estilo de caza para cada animal");
    }
    
    public void alimentarse(){
        
    }
    
    public void sonido(){
        System.out.println("Sonido de animal....");
    }
        
    public void aparasearse(){
        
    }
    
    public void contar(int x){
        if(x>=10){// caso base
            System.out.println("Dejando de contar");
        }else{// caso recursivo 
            System.out.println(x);
            x++;
            contar(x);
        }
    }

    @Override // -> decirle a java que sobreescriba lo que queremos hacer
    public String toString() {
        return "Animal{" + "velocidad=" + velocidad + ", reflejos=" + reflejos + ", patas=" + patas + ", raza=" + raza + ", instintos=" + instintos + ", nombre=" + nombre + ", habitat=" + habitat + ", estado=" + estado + '}';
    }
    
    
}