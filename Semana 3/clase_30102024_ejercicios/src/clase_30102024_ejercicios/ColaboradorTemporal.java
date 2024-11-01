/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_30102024_ejercicios;

/**
 *
 * @author claudiacortes
 */
public class ColaboradorTemporal extends Colaboradores{
      private double salarioBase;
    private double rap;
    private double ihss;
    private double ahorro;

    public ColaboradorTemporal(double salarioBase, double rap, double ihss, double ahorro, int id, String nombre, String fechaIngreso, String puesto) {
        super(id, nombre, fechaIngreso, puesto);
        this.salarioBase = salarioBase;
        this.rap = rap;
        this.ihss = ihss;
        this.ahorro = ahorro;
    }
    
        @Override
    public void generarBoleta(){
        /*
        
         -> salario base 
                -> deduccion del rap
                -> deduccion del ihss
                -> deduccion de ahorro 
        */
        
         double totalDeducciones =  rap+ihss+ahorro;
        System.out.println("Boleta de pago: ");
        System.out.println("Salario: "+this.salarioBase);
        System.out.println("Mes actual: Octubre");
        System.out.println("Deducciones: ");
        System.out.println("RAP............."+rap);
        System.out.println("IHSS............."+ihss);
        System.out.println("AHORRO............."+ahorro);
        System.out.println("TOTAL DEDUCCIONES............."+totalDeducciones);
        System.out.println("TOTAL NETO............."+ (salarioBase-totalDeducciones));
    }
    
}
