/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_23102024;

/**
 *
 * @author claudiacortes
 */
public class Alumno extends Usuario{
    private int cantidadFaltas;
    public Alumno(String correo, String contrasena, int cantidadFaltas) {
        super(correo, contrasena); //llamar al constructor del padre
        this.cantidadFaltas = cantidadFaltas;
    }
    
    void registrarAusencia(){
        cantidadFaltas+=1;
//        cantidadFaltas++;
//        cantidadFaltas = cantidadFaltas+1;
    }

    public int getCantidadFaltas() {
        return cantidadFaltas;
    }

    public void setCantidadFaltas(int cantidadFaltas) {
        this.cantidadFaltas = cantidadFaltas;
    }
    
    
}
