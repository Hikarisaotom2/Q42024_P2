/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_14102024;

/**
 *
 * @author claudiacortes
 */
public class Clase_14102024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000,"Claudia Cortes",1234);
        
        CuentaBancaria nuevaCuenta = cuenta;
        
        System.out.println("Los datos de la cuenta bancaria son: ");
        System.out.println(cuenta);
        
        cuenta.setPin(12345678, "HOLAMUNDO");
        
        cuenta.setPin(12345678, "unitec123!");
        
        
    }
    
}
