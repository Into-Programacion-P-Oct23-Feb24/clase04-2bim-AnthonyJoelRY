/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
       String cadenaFinal="";
        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = new int[3][3];

        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo1[i][j], arreglo2[i][j]);
            }
        }
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
              System.out.printf(" %s %d", cadenaFinal,arreglo1[i][j]);
              if(j==2){
              System.out.print("\n");
                }
            }
        }
        System.out.print("\n");
         for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
              System.out.printf(" %s %d", cadenaFinal,arreglo2[i][j]);
              if(j==2){
              System.out.print("\n");
                }
            }
        }
         System.out.print("\n");
          for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
              System.out.printf(" %s %d", cadenaFinal,arreglo3[i][j]);
              if(j==2){
              System.out.print("\n");
                }
            }
        }

    }

    public static int obtenerMultiplicacion(int a, int b) {
        int multiplicacion;
        multiplicacion = a * b;
        return multiplicacion;
    }

}
