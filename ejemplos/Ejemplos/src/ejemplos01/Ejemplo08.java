/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        // 
        String mensajeSuma;
        String mensajeSumaDos;
        mensajeSuma = obtenerTablaSumar(10, 9); // se invoca al método 
        // obtenerTablaSumar
        // y el valor que 
        // devuelve se lo 
        // almacena  en mensajeSuma

        mensajeSumaDos = obtenerTablaMultiplicar(10, 9);

        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", mensajeSumaDos);
    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
         for (int i = 1; i <= tabla; i++) {
            int x=i;
            for (int e = 1; e <= limite; e++) {
                operacion = x+e;
                cadena = String.format("%s%d + %d = %d\n", cadena, x, e,
                        operacion);
            }
            cadena=String.format("%s\n", cadena);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;

        String cadena = "";
        for (int i = 1; i <= tabla; i++) {
            int x=i;
            for (int e = 1; e <= limite; e++) {
                operacion = x*e;
                cadena = String.format("%s%d * %d = %d\n", cadena, x, e,
                        operacion);
               
            }
             cadena=String.format("%s\n", cadena);
        }
        return cadena;

    }

}
