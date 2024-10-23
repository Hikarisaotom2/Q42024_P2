package clase_21102024;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_21102024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Enums: son clases que nos permiten definir  un rango de datos validos.     
        */
        Dias diaDeLaSemana = Dias.JUEVES;
        Dias diaDeLaSemana2 = Dias.valueOf("MARTES");
        System.out.println("Nombre completo");
        System.out.println(diaDeLaSemana);
        System.out.println("Version corta");
        System.out.println(diaDeLaSemana.getVersionCorta());
        System.out.println("Orden de la semana");
        System.out.println(diaDeLaSemana.getOrdenSemana());

        // tipo de dato lista que ya tiene un tostring
        ArrayList<Dias> dias = new ArrayList<Dias>();
        dias.add(diaDeLaSemana);
        System.out.println(dias);

        // tipo de dato lista que NO tiene un tostring
        Dias [] dia = new Dias [2];
        dia[0] = diaDeLaSemana;
        System.out.println(dia);

    }
    
}
