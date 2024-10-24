/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_23102024;

import javax.swing.JOptionPane;

/**
 *
 * @author claudiacortes
 */
public class Maestro extends Usuario{
    private int cantidadClases;
    public Maestro(String correo, String contrasena, int cantidadClases) {
        super(correo, contrasena); //llamar al constructor del padre
        this.cantidadClases = cantidadClases;
    }
    
    public void iniciarClase(String contrasenaComparar){
        if(contrasena.equals(contrasenaComparar)){
           JOptionPane.showMessageDialog(null,"Exito!","se inicio la clase",0);
        }else{
            JOptionPane.showMessageDialog(null,"Error!","Contrasena incorrecta",1);
        }

    }
    
}
