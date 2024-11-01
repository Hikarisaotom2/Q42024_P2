/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_30102024_ejercicios;

/**
 *
 * @author claudiacortes
 */
public class ColaboradorTiempoIndefinido extends Colaboradores{
    private double salarioBase;
    private double rap;
    private double ihss;
    private double ahorro;

    public ColaboradorTiempoIndefinido(double salarioBase, double rap, double ihss, double ahorro, int id, String nombre, String fechaIngreso, String puesto) {
        super(id, nombre, fechaIngreso, puesto);
        this.salarioBase = salarioBase;
        this.rap = rap;
        this.ihss = ihss;
        this.ahorro = ahorro;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getRap() {
        return rap;
    }

    public void setRap(double rap) {
        this.rap = rap;
    }

    public double getIhss() {
        return ihss;
    }

    public void setIhss(double ihss) {
        this.ihss = ihss;
    }

    public double getAhorro() {
        return ahorro;
    }

    public void setAhorro(double ahorro) {
        this.ahorro = ahorro;
    }


    @Override
    public void generarBoleta(){
        /*
        colaboradores por tiempo indefinido: 
                -> mostrar salario base 
                -> mes actual 
                -> mostrar deducciones: en desglose y el valor total 
                -> mostrar y calcular el valor total neto (valor a recibir) 
        
            -> isr 15% >= 17000
                    isr 20 >= 25000
                    isr 25% >=50000
        */
        double ISR = 0;
        if(salarioBase >=17000 && salarioBase < 25000){
            ISR = salarioBase *0.15;
        }else if(salarioBase >=25000 && salarioBase < 50000){
             ISR = salarioBase *0.20;
        }else if(salarioBase >=50000){
              ISR = salarioBase *0.25;
        }else{
            ISR=0.0;
        }
        double totalDeducciones =  rap+ihss+ahorro+ISR;
        System.out.println("Boleta de pago: ");
        System.out.println("Salario: "+this.salarioBase);
        System.out.println("Mes actual: Octubre");
        System.out.println("Deducciones: ");
        System.out.println("RAP............."+rap);
        System.out.println("IHSS............."+ihss);
        System.out.println("AHORRO............."+ahorro);
        System.out.println("ISR............."+ISR);
        System.out.println("TOTAL DEDUCCIONES............."+totalDeducciones);
        System.out.println("TOTAL NETO............."+ (salarioBase-totalDeducciones));
        
        
    }
    
    
}
