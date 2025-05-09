/*Nivel 2 ejercicio 2
 * Convierto lo que me da la gana parte 2: Demuestre cómo convertir un bucle 
WHILE en un bucle FOR.   

 */

public class whileFor {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int valor1, ejecuto;
        valor1=0;
        ejecuto=0;
        while (valor1<3) {
            ejecuto++;
            System.out.println("el valor del while es igual a "+valor1+" y se ejecuto un numero de: "+ejecuto+" el codigo");
            valor1++;
        }
        valor1=0;
        ejecuto=0;
        for (int i=0;valor1<3;i++ ){
            ejecuto++;
            System.out.println("el valor del for es igual a "+valor1+" y se ejecuto un numero de: "+ejecuto+" el codigo");
            valor1++;
        }
    }    
}
