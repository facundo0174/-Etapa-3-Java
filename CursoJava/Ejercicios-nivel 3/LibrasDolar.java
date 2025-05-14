/*Nivel 3 ejercicio 4 
 * Conversión de libras esterlinas a dólares: Escribir un programa en Java que 
solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en 
dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 
libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa 
deberá mostrar 70 dólares. 
*/
import java.util.Scanner;
public class LibrasDolar {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double TASA_LIBRAS_DOLARES=1.33;//informacion del 2/5/25
        double libras;
        System.out.println("Ingrese la cantidad de libras esterlinas a vender.");
        libras=read.nextDouble();
        System.out.println("Tasa de venta libras esterlinas actual: "+TASA_LIBRAS_DOLARES+
        "\nCantidad de Libras esterlinas: "+libras+"\nCantidad en Dolares Americanos: "+(libras*TASA_LIBRAS_DOLARES));
        read.close();
    }
}