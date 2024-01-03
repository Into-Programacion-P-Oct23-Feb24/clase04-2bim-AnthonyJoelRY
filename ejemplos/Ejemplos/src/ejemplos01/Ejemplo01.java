package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        String miCiudad = obtenerCiudadMayuscula("Loja");
        System.out.printf("%s\n", miCiudad);
         */
        obtenerMultiplicacion(7, 50);
        String miMensaje = obtenerMultiplicacionDos(7, 50);
        System.out.printf("%s\n", miMensaje);
    }

    /*
    El error se en encuentra en la creacion del metodo 
    ya que el mismo no era un metodo statico y al querer obtener
    el valor me daria error por lo ya dicho que el metodo solo obtiene 
    valores del mismo metodo.
     */
    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }

    /*
    visibilidad /tipo de dato/ /nombre de la clase/  /conjunto de datos
    public           void     obtenerMultiplicacion  (int tabla,int limite)
    
    como llamo a un metodo:
    obtenerMultiplicacion (10 , 2)
    int b=0;
    (double)b:Esto me permite cambiar el tipo de la variable.
    
    void :No tiene una valor de retorno osea no devuelve ningun dato osea
    hablamos de un procedimiento.
     */
    public static void obtenerMultiplicacion(int tabla, int limite) {
        int x = 1;
        int resultado = 1;
        String cadenaFinal = "";

        for (int i = 1; x < limite; i++) {
            resultado = tabla * x;
            x++;
            cadenaFinal = String.format("%s%dx%d=%d\n",
                    cadenaFinal, tabla, x, resultado);

        }

    }

    public static String obtenerMultiplicacionDos(int tabla, int limite) {

        int x = 1;
        int resultado = 1;
        String cadenaFinal = "";

        for (int i = 1; x < limite; i++) {
            resultado = tabla * x;
            x++;
            cadenaFinal = String.format("%s%dx%d=%d\n",
                    cadenaFinal, tabla, x, resultado);

        }
        return cadenaFinal;

    }

    public static String obtenerNombre() {
        return "Luis";
    }

}
