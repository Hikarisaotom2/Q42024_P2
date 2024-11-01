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
    private int cantidadHoras;
    private double pagoPorHora;

    public ColaboradorContratista(int cantidadhoras, double pagoPorHora, int id, String nombre, String fechaIngreso, String puesto) {
        super(id, nombre, fechaIngreso, puesto);
        this.cantidadHoras = cantidadhoras;
        this.pagoPorHora = pagoPorHora;
    }

        @Override
    public void generarBoleta(){
        /*
        
                      -> pago por hora 
                    -> cantidad de horas trabajadas 
                    -> total a recibir (horas*pago por hora)
        */
            System.out.println("Boleta de pago: ");
            System.out.println("Mes actual: Octubre");
            System.out.println("Pago por hora ................." + pagoPorHora);
            System.out.println("Cantidad de horas trabajadas ................." + cantidadHoras);
            System.out.println("TOTAL NETO ................." + (pagoPorHora*cantidadHoras));
            
    }
    
}
