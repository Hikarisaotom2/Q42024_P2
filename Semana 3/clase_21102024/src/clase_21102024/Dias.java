/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clase_21102024;

/**
 *
 * @author claudiacortes
 */

public enum Dias {
    LUNES("L",1),  // new Dias("L") -> LUNES("L")
    MARTES("M",2), // new Dias() -> MARTES
    MIERCOLES("X",3),
    JUEVES("J",4),
    VIERNES("V",5);
    
    private String versionCorta;
    private int ordenSemana;
    
    private Dias(String versionCorta, int ordenSemana ){
        this.versionCorta = versionCorta;
        this.ordenSemana= ordenSemana;
    }
    
    public String getVersionCorta(){
        return versionCorta;
    }

    public int getOrdenSemana() {
        return ordenSemana;
    }
    
    
}
