/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_15102024;

/**
 *
 * @author claudiacortes
 */
public class Clase_15102024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Sobrecarga: En terminos computacionales, significa tener algo con el mismo nombre, varias veces, siempre y cuando podamos diferenciarlo de alguna manera.
        */
     

        Registro_Alumnos Claudia = new Registro_Alumnos("Claudia Cortes", "ing.Sistemas", "clau_cortes@unitec.edu", "Titulo de secundaria");
        
        Registro_Alumnos Patricia = new Registro_Alumnos("Patricia Pavon", "Ing. Ciencia de Datos", "sgsss@gmail.com");
        
        Registro_Alumnos claudiaCopia = Claudia; /// guardar en claudiaCopia la direccion de donde esta guardado claudia
        claudiaCopia.setNombre("Patricia Claudia");
        
         
        Registro_Alumnos copiaSeparada = new Registro_Alumnos(Claudia.getNombre(),Claudia.getCarrera(), Claudia.getInfo_contacto(), Claudia.getTitulo());
                  copiaSeparada.setNombre("La copia separada");
        
        System.out.println("DATOS DE CLAUDIA");
        System.out.println(Claudia + " el hashcode es"+ Claudia.hashCode());
        System.out.println("DATOS DE COPIA");
        System.out.println(claudiaCopia+ " el hashcode es"+ claudiaCopia.hashCode());
        System.out.println("DATOS DE LA COPIA SEPARADA");
        System.out.println(copiaSeparada+ " el hashcode es"+ copiaSeparada.hashCode());
    }
    /*
    Como imcorporar diferencias a los metodos sobrecargados.
    1) por el tipo de retorno (no aplica con java)
    2) Cambiando los parametros.
    
    */
    // void MiguelAngel()
    public static void MiguelAngel(){
        
    }
    
    // void MiguelAngel(int,String)
    public static void MiguelAngel(int diferencia, String hola){
   
    }        
        
    // void MiguelAngel(String,int)
    public static void MiguelAngel(String hola, int diferencia){
   
    }
    
}
