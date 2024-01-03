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
        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = new int[3][3];

        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo1[i][j], arreglo2[i][j]);
            }
        }

    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);

    }

    public static int obtenerMultiplicacion(int primerValor, int segundoValor) {
       
    }

}
