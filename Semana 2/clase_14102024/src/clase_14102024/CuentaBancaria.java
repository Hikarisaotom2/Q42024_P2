/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_14102024;

/**
 *
 * @author claudiacortes
 */
public class CuentaBancaria {
    
    /*
    Controles de acceso: 
    1.Public: Publico, cualquier parte del programa tendra acceso a este valor.Por defecto si no ponemos nada, java marca los atributos como publicos.
    2.Private: Privado , Nadie mas que la clase, puede acceder a ese valor 
    
    */
    
    //Atributos 
     public double cantidadDinero;
     public String propietario;
     private int pin;
    
    //Metodos

    public CuentaBancaria(double cantidadDinero, String propietario, int pin) {
        this.cantidadDinero = cantidadDinero;
        this.propietario = propietario;
        this.pin = pin;
    }

  

    //setter  -> actualizan la informacion del atributo
    public void setPin(int pin, String contrasena) {
        if(contrasena.equalsIgnoreCase("unitec123!")){
          this.pin = pin;  
            System.out.println("Contrasena actualizada");
        }else{
            System.out.println("Contrasena incorrecta");
        }
    }

    //getters - > visualizar el valor actual del atributo

    @Override
    public String toString() {
        return propietario+":"+cantidadDinero;
    }
    
    
    
}
