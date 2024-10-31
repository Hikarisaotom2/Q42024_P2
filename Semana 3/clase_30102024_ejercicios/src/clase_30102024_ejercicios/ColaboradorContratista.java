/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_30102024_ejercicios;

/**
 *
 * @author claudiacortes
 */
public class ColaboradorContratista extends Colaboradores{
    private int cantidadhoras;
    private double pagoPorHora;

    public ColaboradorContratista(int cantidadhoras, double pagoPorHora, int id, String nombre, String fechaIngreso, String puesto) {
        super(id, nombre, fechaIngreso, puesto);
        this.cantidadhoras = cantidadhoras;
        this.pagoPorHora = pagoPorHora;
    }

    
    
}
